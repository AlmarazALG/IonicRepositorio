import { Component,ViewChild } from '@angular/core';
import { Router } from '@angular/router';

import { IonModal } from '@ionic/angular';
import { OverlayEventDetail } from '@ionic/core/components';
import { Cine } from '../modelos/Cine';
import { CineService } from '../servicios/cine/cine.service';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page {
  public lista: Array<Cine>;
  public seleccionado: Cine = new Cine();

  @ViewChild(IonModal) modal: IonModal;
  name: string;
  cinesServicio: any;

  cancel() {
    this.modal.dismiss(null, 'cancelar');
  }

  confirm() {
    this.modal.dismiss(this.name, 'guardar');
  }

  //public datoAlHijo: number = 10;

  constructor(
    private router: Router
  ) { }

  ngOnInit() {
    this.obtenerCine();
  }

  obtenerCine(){
    this.cinesServicio.obtenerCine().subscribe(
      res => {
        this.lista = res;
      },
      error => {

      },
      ()=>{

      }
    );
  }

/*
  irANuevaPagina() {
    this.router.navigate(['/tabs/nueva/pagina','Samantha', 21], {queryParams: {hola:'adios',  nombre: 'Samantha***'}});
    //console.log("ir a nuevo link");
    //this.router.navigateByUrl('/tabs/nueva/pagina');
  }

  actualizaDatoHijo(evento){
    console.log(evento);
  }*/
}
