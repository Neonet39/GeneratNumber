package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Evgeny on 27.08.2017.
 */
@Controller
public class Controller_Error {

    @RequestMapping(value = "/error_page",method = RequestMethod.GET)
    public String Error_403(){
        return "error_page";
    }
}
