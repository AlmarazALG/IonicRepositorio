
package com.cap.examen.modulos.cine_sala.dto;

import com.cap.examen.modelos.Cine;
import java.sql.Timestamp;


public class CineDTO {
    
    private Integer cineId;
    
    private String nombre;
    
    private Timestamp fechaAlta;
    
    private Timestamp fechaModificacion;
    
    private Boolean registroActivo;

    
    public CineDTO() {
        super();
    }

    public CineDTO(Integer cineId, String nombre, Timestamp fechaAlta, Timestamp fechaModificacion, Boolean registroActivo) {
        this.cineId = cineId;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.registroActivo = registroActivo;
    }
    
    public CineDTO(Cine cine){
        if (cine != null){
            this.cineId = cine.getIdCine();
            this.nombre = cine.getNombre();
            this.fechaAlta = cine.getFechaAlta();
            this.fechaModificacion = cine.getFechaModificacion();
            this.registroActivo = cine.getRegistroActivo();
        }
    }

    public CineDTO(Integer cineId, String nombre, Timestamp fechaModificacion) {
        this.cineId = cineId;
        this.nombre = nombre;
        this.fechaModificacion = fechaModificacion;
    }

    public CineDTO(Integer cineId, String nombre) {
        this.cineId = cineId;
        this.nombre = nombre;
    }

    public Integer getCineId() {
        return cineId;
    }

    public void setCineId(Integer cineId) {
        this.cineId = cineId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Boolean getRegistroActivo() {
        return registroActivo;
    }

    public void setRegistroActivo(Boolean registroActivo) {
        this.registroActivo = registroActivo;
    }
    
    
    
}
