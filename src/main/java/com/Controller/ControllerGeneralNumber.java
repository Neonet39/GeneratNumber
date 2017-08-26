package com.Controller;

import com.Model.NumberModel;
import com.Service.GenerateNumberService.GenerateNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Evgeny on 26.08.2017.
 */

@Controller
@RequestMapping(value = "/number")
public class ControllerGeneralNumber {
    @Autowired
    GenerateNumberService numberService;

    @RequestMapping(value = "/generating_numbers",method = RequestMethod.GET)
    public ModelAndView generating_numbers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("numberModel",new NumberModel());
        modelAndView.setViewName("generating_numbers");
        modelAndView.addObject("number",numberService.generateNumber());

        return modelAndView;
    }




    @RequestMapping(value = "/generating_numbers",method = RequestMethod.POST)
    public ModelAndView get_number(@ModelAttribute("numberModel") NumberModel numberModel){


        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("number",numberService.getNumber(numberModel.getOneNumber(),
                numberModel.getToNumber()));

        modelAndView.setViewName("generating_numbers");

        return modelAndView;
    }






    @RequestMapping(value = "/get_number",method = RequestMethod.GET)
    public String get_number(){
        return "generating_numbers";
    }

}
