
package com.cap.examen.modulos.cine_sala.controlador;

import com.cap.examen.modulos.cine_sala.dto.SalaDTO;
import com.cap.examen.modulos.cine_sala.servicio.SalaServicio;
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
@RequestMapping("sala")
public class SalaControlador {
    @Autowired
    private SalaServicio salaServicio;
    
    @GetMapping("obtener")
    public ResponseEntity<List<SalaDTO>> obtenerSala(){
        List<SalaDTO> respuesta = salaServicio.obtenerSala();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("obtener/id")
    public ResponseEntity<SalaDTO> obtenerEmpleados(@RequestParam Integer idSala){
        SalaDTO respuesta = salaServicio.obtenerSalaPorId(idSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PostMapping("guardar")
    public ResponseEntity<Boolean> guardarCine(@RequestBody SalaDTO parametros){
        Boolean respuesta = salaServicio.guardarSala(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PutMapping("actualizar")
    public ResponseEntity<Boolean> actualizarCine(@RequestBody SalaDTO parametros){
        Boolean respuesta = salaServicio.actualizarSala(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
    
    //Pasando parametros por body
    @PutMapping("activar-inactivar")
    public ResponseEntity<Boolean> activarInactivar(@RequestBody SalaDTO sala){
        Boolean respuesta = salaServicio.activarInactivar(sala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
