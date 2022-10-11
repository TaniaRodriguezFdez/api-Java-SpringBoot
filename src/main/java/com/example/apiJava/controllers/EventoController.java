package com.example.apiJava.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiJava.models.EventoModel;
import com.example.apiJava.services.EventoService;

@RestController
@RequestMapping("/evento/")
public class EventoController {
    @Autowired
    EventoService eventoService;
    
    @GetMapping(value="/evento")
    public ArrayList<EventoModel> obtenerEventos(){
        return eventoService.obtenerEventos();
    }
    @PostMapping()
    public EventoModel guardarEvento(@RequestBody EventoModel evento){
        return this.eventoService.guardarEvento(evento);

    }
    @GetMapping( path = "evento/{id}")
    public Optional<EventoModel> obtenerEventoPorId(@PathVariable("id") Long id) {
        return this.eventoService.obtenerPorId(id);
    }

   

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.eventoService.eliminarEvento(id);
        if (ok){
            return "Se eliminó el evento con id :" + id;
        }else{
            return "No se pudo eliminar el evento con id" + id;
        }
    }

    
}


