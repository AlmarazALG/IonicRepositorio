
package com.cap.examen.modelos;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "r_cine_sala")
public class CineSala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idCineSala;
    
    @Column
    private Timestamp fechaAlta;
    
    @Column
    private Timestamp fechaModificacion;
    
    @Column
    private Boolean registroActivo;
    
    @JoinColumn(name = "id_cine")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cine cine;
    
    @JoinColumn(name = "id_sala")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sala sala;

    public Integer getIdCineSala() {
        return idCineSala;
    }

    public void setIdCineSala(Integer idCineSala) {
        this.idCineSala = idCineSala;
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

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
}
