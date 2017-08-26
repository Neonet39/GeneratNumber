package com.Controller;

import com.Service.AdminService.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Evgeny on 26.08.2017.
 */
@RequestMapping(value = "/personal")
@Controller
public class ControllerPersonal {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/administrator_area",method = RequestMethod.GET)
    public ModelAndView administrator_area(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("number",adminService.getNumber());
        modelAndView.setViewName("administrator_area");

        return modelAndView;
    }

    @RequestMapping(value = "/administrator_set_param",method = RequestMethod.GET)
    public String administrator_set_param(@RequestParam("number") String number,
                                 @RequestParam("metodNull") boolean metodNull){
        if(number!=null) {
            try {
                int namberInt = Integer.valueOf(number);
                adminService.setNumber(number);
            }catch (Exception e){

            }
        }
        if(metodNull)
            adminService.method_null();

        return "redirect:/personal/administrator_area";
    }

}
