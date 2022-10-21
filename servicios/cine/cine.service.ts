import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';
import { Cine } from 'src/app/modelos/Cine';

@Injectable({
  providedIn: 'root'
})
export class CineService {

  constructor(
    private rest: HttpClient
  ) { }

  urlBase =  'http://localhost:9000/cine/';
   header = { headers: {
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET,POST,OPTIONS,DELETE,PUT',
      'Access-Control-Allow-Headers': 'Content-Type',
      'Content-Type': 'application/json'
    }
  };

  obtenerCine(): Observable<any>{
    return  this.rest.get(this.urlBase+'obtener',this.header).pipe( map ( res => {
      return res;
    }));
  }

  obtenerCinePorId(id): Observable<any>{
    return  this.rest.get(this.urlBase+'obtener/id?idCine='+id,this.header).pipe( map ( res => {
      return res;
    }));
  }

  guardarCine(cine) {
    return  this.rest.post(this.urlBase+'guardar',null,this.header).pipe( map ( res => {
      return res;
    }));
  }

  actualizarCine(cine){
    return  this.rest.put(this.urlBase+'actualizar',null,this.header).pipe( map ( res => {
      return res;
    }));
  }

  activarInactivar(idCine) {
    return  this.rest.put(this.urlBase+'activar-inactivar?idCine='+idCine,this.header).pipe( map ( res => {
      return res;
    }));
  }
}
