package com.miniprojet.rechauffementclimatique.controllerVIEW;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {

    @RequestMapping("/")
    public String test (){
        return "index";
    }
}
