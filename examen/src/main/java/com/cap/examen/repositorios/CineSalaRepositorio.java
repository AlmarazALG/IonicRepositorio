
package com.cap.examen.repositorios;

import com.cap.examen.modelos.CineSala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CineSalaRepositorio extends JpaRepository<CineSala,Integer>{
    @Query("select cs from CineSala as cs " +
            "where cs.registroActivo = true")
    List<CineSala> obtenerCineSalaActivos();
    
    
    /*@Query("select cs from CineSala cs where cs.cine.idCine = :idCine and cs.registroActivo = true AND cs.sala.idSala = :idSala")
    List<CineSala> obtenerSalaDeCine(@Param("idCine") Integer idCine, @Param("idSala")  Integer idSala);*/
    
    
}
