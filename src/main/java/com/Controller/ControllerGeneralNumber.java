package com.Controller;

import com.Dao.NumberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Evgeny on 26.08.2017.
 */

@Controller
@RequestMapping(value = "/number")
public class ControllerGeneralNumber {
    @Autowired
    NumberDao numberDao;
    @RequestMapping(value = "/generating_numbers",method = RequestMethod.GET)
    public String generating_numbers(){

        return "generating_numbers";
    }

    @RequestMapping(value = "/get_number",method = RequestMethod.GET)
    public String get_number(){
        return "generating_numbers";
    }

}
