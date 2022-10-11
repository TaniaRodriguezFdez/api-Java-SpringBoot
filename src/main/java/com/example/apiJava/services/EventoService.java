package com.example.apiJava.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiJava.models.EventoModel;
import com.example.apiJava.repositories.EventoRepository;

@Service
public class EventoService {
    @Autowired
    EventoRepository eventoRepository;

    public ArrayList<EventoModel> obtenerEventos(){
        return(ArrayList<EventoModel>)eventoRepository.findAll();
    }
    public EventoModel guardarEvento(EventoModel evento){
        return eventoRepository.save(evento);
    }
    public Optional<EventoModel> obtenerPorId(Long id) {
        return null;
    }
    public boolean eliminarEvento(Long id) {
        try{
            eventoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
