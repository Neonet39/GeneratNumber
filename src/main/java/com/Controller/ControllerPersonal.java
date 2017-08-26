package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Evgeny on 26.08.2017.
 */
@Controller
public class ControllerPersonal {

    @RequestMapping(value = "/administrator_area")
    public String administrator_area(){
        return "administrator_area";
    }
}
