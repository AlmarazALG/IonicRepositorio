
package com.cap.examen.modulos.cine_sala.dto;

import com.cap.examen.modelos.Sala;
import java.sql.Timestamp;


public class SalaDTO {
    
    private Integer salaId;
    
    private Byte numeroSala;
    
    private Integer totalAsientos;
    
    private Timestamp fechaAlta;
    
    private Timestamp fechaModificacion;
    
    private Boolean registroActivo;

    public SalaDTO() {
        super();
    }

    public SalaDTO(Integer salaId, Byte numeroSala, Integer totalAsientos, Timestamp fechaAlta, Timestamp fechaModificacion, Boolean registroActivo) {
        this.salaId = salaId;
        this.numeroSala = numeroSala;
        this.totalAsientos = totalAsientos;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.registroActivo = registroActivo;
    }

    public SalaDTO(Integer salaId, Byte numeroSala, Integer totalAsientos, Timestamp fechaModificacion, Boolean registroActivo) {
        this.salaId = salaId;
        this.numeroSala = numeroSala;
        this.totalAsientos = totalAsientos;
        this.fechaModificacion = fechaModificacion;
        this.registroActivo = registroActivo;
    }
    

    public SalaDTO(Integer salaId, Byte numeroSala) {
        this.salaId = salaId;
        this.numeroSala = numeroSala;
    }

    public SalaDTO(Sala sala){
        if (sala != null){
            this.salaId = sala.getIdSala();
            this.numeroSala = sala.getNumeroSala();
            this.totalAsientos = sala.getTotalAsientos();
            this.fechaAlta = sala.getFechaAlta();
            this.fechaModificacion = sala.getFechaModificacion();
            this.registroActivo = sala.getRegistroActivo();
        }
    }

    public Integer getSalaId() {
        return salaId;
    }

    public void setSalaId(Integer salaId) {
        this.salaId = salaId;
    }

    public Byte getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Byte numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getTotalAsientos() {
        return totalAsientos;
    }

    public void setTotalAsientos(Integer totalAsientos) {
        this.totalAsientos = totalAsientos;
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
