
package com.cap.examen.modulos.cine_sala.controlador;

import com.cap.examen.modulos.cine_sala.dto.CineDTO;
import com.cap.examen.modulos.cine_sala.servicio.CineServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cine")
public class CineControlador {
    
    @Autowired
    private CineServicio cineServicio;
    
    @GetMapping("obtener")
    public ResponseEntity<List<CineDTO>> obtenerCine(){
        List<CineDTO> respuesta = cineServicio.obtenerCine();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
    
    /*@GetMapping("obtener/Cines/por-sala")
    public ResponseEntity<List<CineDTO>> obtenerCinesPorSala(@RequestParam Integer idCine, @RequestParam Integer idSala){
        List<CineDTO> respuesta = cineServicio.obtenerSalaDeCine(idCine, idSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }*/

    @GetMapping("obtener/id")
    public ResponseEntity<CineDTO> obtenerCinePorId(@RequestParam Integer idCine){
        CineDTO respuesta = cineServicio.obtenerCinePorId(idCine);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PostMapping("guardar")
    public ResponseEntity<Boolean> guardarCine(@RequestBody CineDTO parametros){
        Boolean respuesta = cineServicio.guardarCine(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PutMapping("actualizar")
    public ResponseEntity<Boolean> actualizarCine(@RequestBody CineDTO parametros){
        Boolean respuesta = cineServicio.actualizarCine(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
    
    //Pasando parametros por body
    @PutMapping("activar-inactivar")
    public ResponseEntity<Boolean> activarInactivar(@RequestBody CineDTO cine){
        Boolean respuesta = cineServicio.activarInactivar(cine);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
