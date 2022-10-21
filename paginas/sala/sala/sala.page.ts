import { Component, OnInit } from '@angular/core';
import { Sala } from 'src/app/modelos/Sala';
import { SalaService } from 'src/app/servicios/sala/sala.service';
import { ActivatedRoute, Router } from "@angular/router";

@Component({
  selector: 'app-sala',
  templateUrl: './sala.page.html',
  styleUrls: ['./sala.page.scss'],
})
export class SalaPage implements OnInit {

  private sala: Sala = new Sala();

  constructor(
    private router: Router,
    private url: ActivatedRoute,
    private salaServicio: SalaService
  ) { }

  ngOnInit() {
    this.url.queryParams.subscribe(
      queryParam => {
        this.sala = JSON.parse(JSON.stringify(queryParam));
      }
    )
  }

  guardar() {
    const dato = {
      id: this.sala.id,
      numeroS : this.sala.numeroS,
      totalA : this.sala.totalA,
      fechaA: this.sala.fechaA,
      fechaM: this.sala.fechaM,
      activo: this.sala.activo
    };
    this.salaServicio.guardarSala(dato).subscribe(res => {
      console.log(res);
      this.router.navigate(['/post']);
    });
  }

}
