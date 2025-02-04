package es.pildoras.proyecto1.proyecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MiRestController {


    @GetMapping("/")
    public String saludo(){
        return "index";
    }

    @GetMapping("/info")
    public String informacion(){
        return "esta es la web de los mejores programadores";
    }
}

