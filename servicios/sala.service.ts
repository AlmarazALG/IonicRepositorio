import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';
import { Sala } from 'src/app/modelos/Sala';

@Injectable({
  providedIn: 'root'
})
export class SalaService {

  constructor(
    private rest: HttpClient
  ) { }

  urlBase =  'http://localhost:9000/sala/';
   header = { headers: {
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET,POST,OPTIONS,DELETE,PUT',
      'Access-Control-Allow-Headers': 'Content-Type',
      'Content-Type': 'application/json'
    }
  };

  obtenerSala(): Observable<any>{
    return  this.rest.get(this.urlBase+'obtener',this.header).pipe( map ( res => {
      return res;
    }));
  }

  obtenerSalaPorId(id): Observable<any>{
    return  this.rest.get(this.urlBase+'obtener/id?idSala='+id,this.header).pipe( map ( res => {
      return res;
    }));
  }

  guardarSala(sala) {
    return  this.rest.post(this.urlBase+'guardar',null,this.header).pipe( map ( res => {
      return res;
    }));
  }

  actualizarSala(sala){
    return  this.rest.put(this.urlBase+'actualizar',null,this.header).pipe( map ( res => {
      return res;
    }));
  }

  activarInactivar(idSala) {
    return  this.rest.put(this.urlBase+'activar-inactivar?idSala='+idSala,this.header).pipe( map ( res => {
      return res;
    }));
  }
}
