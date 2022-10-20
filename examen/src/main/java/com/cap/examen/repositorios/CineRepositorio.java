
package com.cap.examen.repositorios;

import com.cap.examen.modelos.Cine;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepositorio extends JpaRepository<Cine,Integer>{
    @Query("select c from Cine as c " +
            "where c.registroActivo = true")
    List<Cine> obtenerCineActivos();
    
    List<Cine> findAll();
    
    
    /*@Query("select c from Cine")
    List<Cine> obtenerSalaDeCine(Integer idCine, Integer idSala);*/
    
}
