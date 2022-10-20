
package com.cap.examen.repositorios;

import com.cap.examen.modelos.Sala;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepositorio extends JpaRepository<Sala,Integer>{
    @Query("select s from Sala as s " +
            "where s.registroActivo = true")
    List<Sala> obtenerSalaActivos();
    
    
    List<Sala> findAll();
}
