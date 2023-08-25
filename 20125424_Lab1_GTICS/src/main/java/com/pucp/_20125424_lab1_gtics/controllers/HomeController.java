package com.pucp._20125424_lab1_gtics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/principal",method = RequestMethod.GET)
    public String empleado(){
        return "principal";
    }
}
