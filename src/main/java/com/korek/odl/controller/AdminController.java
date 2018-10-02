package com.korek.odl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping(value = {"/","/index"})
    public String index(Model model){
        model.addAttribute("ONE", "ONEONE");
        return "/admin/index";
    }

}
