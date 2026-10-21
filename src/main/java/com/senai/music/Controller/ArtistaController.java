package com.senai.music.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistaController {
    @GetMapping("Artista")
     public String mostrarArtista() {
        return "Artista";
    }
}
