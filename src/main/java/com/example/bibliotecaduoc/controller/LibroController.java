package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;


    @GetMapping
    public List<Libro>listaLibros(){
        return libroService.getLibros();
    }

    @PostMapping
    public Libro buscaLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);

    }
    @GetMapping
    public Libro actualizaLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.updateLibro(libro);

    }

    @DeleteMapping
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }
    
    
}
