package com.braian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
    @RequestMapping("/CadastroEvento")
    public String Cadastro(){
        return "corpoSite/formCadastro";
    }
}
