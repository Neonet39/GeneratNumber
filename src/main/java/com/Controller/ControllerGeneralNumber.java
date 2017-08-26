package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Evgeny on 26.08.2017.
 */

@Controller
@RequestMapping(value = "/number")
public class ControllerGeneralNumber {

    @RequestMapping(value = "/generating_numbers",method = RequestMethod.GET)
    public String generating_numbers(){
        return "generating_numbers";
    }
}
