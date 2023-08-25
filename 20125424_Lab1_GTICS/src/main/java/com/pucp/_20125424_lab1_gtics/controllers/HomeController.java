package com.pucp._20125424_lab1_gtics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {




    @RequestMapping("/principal")
    public String principalpucp(Model model,  @RequestParam(value = "code" , required = false) String pucp2 )
    {
        try{
            if (pucp2.equals("PUCP")){
                Integer pucp = 1;
                model.addAttribute("pucp", pucp);
            }
        }catch (Exception  e){
            return "principal";
        }


        return "principal";
    }
}
