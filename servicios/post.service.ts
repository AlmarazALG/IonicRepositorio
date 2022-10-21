import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';
import {Empleado} from "../modelos/Empleado";

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(
    private rest: HttpClient
  ) { }

  urlBase =  'http://localhost:9000/empleado/';
   header = { headers: {
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET,POST,OPTIONS,DELETE,PUT',
      'Access-Control-Allow-Headers': 'Content-Type',
      'Content-Type': 'application/json'
    }
  };

  obtenerPosts(): Observable<any>{
    return  this.rest.get(this.urlBase+'obtener',this.header).pipe( map ( res => {
      return res;
    }));
  }

obtenerPost(id): Observable<any>{
  return  this.rest.get(this.urlBase+'obtener/id?idEmpleado='+id,this.header).pipe( map ( res => {
    return res;
  }));
}

  guadarEmpleado(empleado) {
    return  this.rest.post(this.urlBase+'guardar',null,this.header).pipe( map ( res => {
      return res;
    }));
  }

  activarInactivar(idEmpleado) {
    return  this.rest.put(this.urlBase+'activar-inactivar?idEmpleado='+idEmpleado,this.header).pipe( map ( res => {
      return res;
    }));
  }
}
