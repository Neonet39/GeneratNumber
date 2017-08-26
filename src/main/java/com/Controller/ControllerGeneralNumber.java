package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Evgeny on 26.08.2017.
 */
@Controller
public class ControllerGeneralNumber {

    @RequestMapping(value = "/generating_numbers")
    public String generating_numbers(){
        return "generating_numbers";
    }
}
