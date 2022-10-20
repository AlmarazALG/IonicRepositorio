
package com.cap.examen.modelos;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "m_cine")
public class Cine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idCine;
    
    @Column
    private String nombre;
    
    @Column
    private Timestamp fechaAlta;
    
    @Column
    private Timestamp fechaModificacion;
    
    @Column
    private Boolean registroActivo;
    
    @OneToMany(mappedBy = "cine", fetch = FetchType.LAZY)
    private Set<CineSala> cinesala;

    public Integer getIdCine() {
        return idCine;
    }

    public void setIdCine(Integer idCine) {
        this.idCine = idCine;
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

    public Set<CineSala> getCineSala() {
        return cinesala;
    }

    public void setCineSala(Set<CineSala> cinesala) {
        this.cinesala = cinesala;
    }
    
    
}
