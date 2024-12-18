package com.SpringCRUD.demo.controller;

import com.SpringCRUD.demo.model.Usuario;
import com.SpringCRUD.demo.model.Viaje;
import com.SpringCRUD.demo.services.ViajeService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/viajes")
public class ViajeControlador {

    private final Logger LOGGER= LoggerFactory.getLogger(ViajeControlador.class);
    @Autowired
    private ViajeService viajeService;

    @GetMapping("")
    public String showViajes(){
        return "viajes/show";
    }
    @GetMapping("/create")
    public String create(){
        return "viajes/create";
    }
    @PostMapping("/save")
    public String save(Viaje viaje){
        viajeService.save(viaje);
        Usuario user = new Usuario( 1,"", "","","","", "");
        viaje.setUsuario(user);
        LOGGER.info(viaje.toString());
        return "redirect:/viajes";
    }
}

