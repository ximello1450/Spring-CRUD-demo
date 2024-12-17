package com.SpringCRUD.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/viajes")
public class ViajeControlador {
    @GetMapping("")
    public String showViajes(){
        return "viajes/show";
    }
}
