
package com.cap.examen.modulos.cine_sala.dto;

import java.sql.Timestamp;


public class CineSalaDTO {
    
    private Integer cineSalaId;
    
    private Timestamp fechaAlta;
    
    private Timestamp fechaModificacion;
    
    private Boolean registroActivo;

    public CineSalaDTO(Integer cineSalaId, Timestamp fechaAlta, Timestamp fechaModificacion, Boolean registroActivo) {
        this.cineSalaId = cineSalaId;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.registroActivo = registroActivo;
    }

    public CineSalaDTO() {
        super();
    }
    
    
    
    
}
