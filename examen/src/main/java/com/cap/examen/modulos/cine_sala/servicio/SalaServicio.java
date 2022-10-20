
package com.cap.examen.modulos.cine_sala.servicio;

import com.cap.examen.modelos.Sala;
import com.cap.examen.modulos.cine_sala.dto.SalaDTO;
import com.cap.examen.repositorios.SalaRepositorio;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServicio {
    
    @Autowired
    private SalaRepositorio salaRepositorio;
    
    //Obtener listado de salas
    public List<SalaDTO> obtenerSala(){
        List<Sala> lista = salaRepositorio.obtenerSalaActivos();
        return lista.stream().map(SalaDTO::new).collect(Collectors.toList());
    }
    
    //Obtener un cine
    public SalaDTO obtenerSalaPorId(Integer idSala){
        Optional<Sala> sala = salaRepositorio.findById(idSala);

        if (sala.isPresent()){
            return new SalaDTO(sala.get().getIdSala(), sala.get().getNumeroSala(), sala.get().getTotalAsientos(), sala.get().getFechaAlta(), sala.get().getFechaModificacion(), sala.get().getRegistroActivo());
        }

        return null;
    }

    //Crear sala
    public Boolean guardarSala(SalaDTO parametros) {

        Sala sala = new Sala();

        if (parametros.getSalaId() != null){
            sala = salaRepositorio.getOne(parametros.getSalaId());
        }


        sala.setNumeroSala(parametros.getNumeroSala());
        sala.setTotalAsientos(parametros.getTotalAsientos());
        sala.setFechaAlta(parametros.getFechaAlta());
        sala.setFechaModificacion(parametros.getFechaModificacion());
        sala.setRegistroActivo(Boolean.TRUE);

        salaRepositorio.save(sala);


        return true;
    }

    //Modificar sala
    public Boolean actualizarSala(SalaDTO parametros) {

        Sala sala = salaRepositorio.getOne(parametros.getSalaId());
        sala.setNumeroSala(parametros.getNumeroSala());
        sala.setFechaModificacion(parametros.getFechaModificacion());
        sala.setRegistroActivo(Boolean.TRUE);

        salaRepositorio.save(sala);


        return true;
    }

        //Eliminado logico y activado
    public Boolean activarInactivar(SalaDTO idSala) {
        Sala sala = salaRepositorio.getOne(idSala.getSalaId());
        sala.setRegistroActivo(!sala.getRegistroActivo());
        salaRepositorio.save(sala);
        return true;
    }
    
}
