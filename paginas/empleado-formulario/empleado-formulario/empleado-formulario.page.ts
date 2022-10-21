import { Component, OnInit } from '@angular/core';
import { Empleado } from 'src/app/modelos/Empleado';
import {PostService} from "../../../servicios/post.service";
import {Area} from "../../../modelos/Area";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-empleado-formulario',
  templateUrl: './empleado-formulario.page.html',
  styleUrls: ['./empleado-formulario.page.scss'],
})
export class EmpleadoFormularioPage implements OnInit {

  private empleado: Empleado =  new Empleado();

  constructor(
    private router: Router,
    private url: ActivatedRoute,
    private empleadoServicio: PostService
  ) { }

  ngOnInit() {
    this.url.queryParams.subscribe(
      queryParam => {
        this.empleado = JSON.parse(JSON.stringify(queryParam));
      }
    )
  }

  guardar() {
    this.empleado.area= new Area();
    this.empleado.area.idArea = 1;
    const dato = {
      empleadoId: this.empleado.empleadoId,
      empleado: this.empleado.empleado,
      apellido: this.empleado.apellido,
      fecha: this.empleado.fecha,
      area: {idArea: this.empleado.area.idArea},
    };
    this.empleadoServicio.guadarEmpleado(dato).subscribe(res => {
      console.log(res);
      this.router.navigate(['/post']);
    });
  }
}
