
package com.cap.examen.modulos.cine_sala.servicio;

import com.cap.examen.modelos.Cine;
import com.cap.examen.modulos.cine_sala.dto.CineDTO;
import com.cap.examen.repositorios.CineRepositorio;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicio {
    
    @Autowired
    private CineRepositorio cineRepositorio;
    
    
    //Obtener listado de cines
    public List<CineDTO> obtenerCine(){
        List<Cine> lista = cineRepositorio.obtenerCineActivos();
        return lista.stream().map(CineDTO::new).collect(Collectors.toList());
    }
    
    //Obtener un cine
    public CineDTO obtenerCinePorId(Integer idCine){
        Optional<Cine> cine = cineRepositorio.findById(idCine);

        if (cine.isPresent()){
            return new CineDTO(cine.get().getIdCine(), cine.get().getNombre(), cine.get().getFechaAlta(), cine.get().getFechaModificacion(), cine.get().getRegistroActivo());
        }

        return null;
    }

    //Crear cine
    public Boolean guardarCine(CineDTO parametros) {

        Cine cine = new Cine();

        if (parametros.getCineId() != null){
            cine = cineRepositorio.getOne(parametros.getCineId());
        }

        cine.setNombre(parametros.getNombre());
        cine.setFechaAlta(parametros.getFechaAlta());
        cine.setFechaModificacion(parametros.getFechaModificacion());
        cine.setRegistroActivo(Boolean.TRUE);

        cineRepositorio.save(cine);


        return true;
    }

    //Modificar cine
    public Boolean actualizarCine(CineDTO parametros) {

        Cine cine = cineRepositorio.getOne(parametros.getCineId());
        cine.setNombre(parametros.getNombre());
        cine.setFechaModificacion(parametros.getFechaModificacion());
        cine.setRegistroActivo(Boolean.TRUE);

        cineRepositorio.save(cine);


        return true;
    }

        //Eliminado logico y activado
    public Boolean activarInactivar(CineDTO idCine) {
        Cine cine = cineRepositorio.getOne(idCine.getCineId());
        cine.setRegistroActivo(!cine.getRegistroActivo());
        cineRepositorio.save(cine);
        return true;
    }
    
    // una sala con un cine
    /*public List<CineDTO> obtenerSalaDeCine(Integer idCine, Integer idSala) {
        List<Cine> lista =  cineRepositorio.obtenerSalaDeCine(idCine,idSala);
        return  lista.stream().map(CineDTO::new).collect(Collectors.toList());
    }*/
}
