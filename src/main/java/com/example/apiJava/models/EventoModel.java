package com.example.apiJava.models;
import javax.persistence.*;

@Entity
@Table(name = "eventos")


public class EventoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    
    private Long id;
    private String título;
    private String fecha;
    private String Imagen;
    private String descripción;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getImagen() {
        return Imagen;
    }
    public void setImagen(String imagen) {
        Imagen = imagen;
    }
    public String getDescripción() {
        return descripción;
    }
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
}
