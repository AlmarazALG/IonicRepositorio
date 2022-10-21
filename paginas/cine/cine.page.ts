import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Cine } from 'src/app/modelos/Cine';
import { CineService } from 'src/app/servicios/cine.service';

@Component({
  selector: 'app-cine',
  templateUrl: './cine.page.html',
  styleUrls: ['./cine.page.scss'],
})
export class CinePage implements OnInit {

  public cine: Cine =  new Cine();

  constructor(
    private router: Router,
    private url: ActivatedRoute,
    private cineServicio: CineService
  ) { }

  ngOnInit() {
    this.url.queryParams.subscribe(
      queryParam => {
        this.cine = JSON.parse(JSON.stringify(queryParam));
      }
    )
  }

  guardar() {
    const dato = {
      id: this.cine.id,
      nombre: this.cine.nombre,
      fechaA: this.cine.fechaA,
      fechaM: this.cine.fechaM,
      activo: this.cine.activo
    };
    this.cineServicio.guardarCine(dato).subscribe(res => {
      console.log(res);
      this.router.navigate(['/post']);
    });
  }

}
