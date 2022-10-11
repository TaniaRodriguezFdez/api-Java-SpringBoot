package com.example.apiJava.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.apiJava.models.EventoModel;

@Repository
public interface EventoRepository extends CrudRepository<EventoModel, Long> {

}
