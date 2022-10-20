
package com.cap.examen.modelos;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "c_sala")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idSala;
    
    @Column
    private Byte numeroSala;
    
    @Column
    private Integer totalAsientos;
    
    @Column
    private Timestamp fechaAlta;
    
    @Column
    private Timestamp fechaModificacion;
    
    @Column
    private Boolean registroActivo;
    
    @OneToMany(mappedBy = "sala", fetch = FetchType.LAZY)
    private Set<CineSala> cineSala;

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
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

    public Set<CineSala> getCineSala() {
        return cineSala;
    }

    public void setCineSala(Set<CineSala> cineSala) {
        this.cineSala = cineSala;
    }
    
    
}
