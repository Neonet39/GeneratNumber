package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Evgeny on 26.08.2017.
 */
@RequestMapping(value = "/personal")
@Controller
public class ControllerPersonal {

    @RequestMapping(value = "/administrator_area",method = RequestMethod.GET)
    public String administrator_area(){
        return "administrator_area";
    }
}
