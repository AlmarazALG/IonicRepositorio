
import { Component, ViewChild } from '@angular/core';
import { Router } from '@angular/router';

import { IonModal } from '@ionic/angular';
import { OverlayEventDetail } from '@ionic/core/components';
import { Sala } from '../modelos/Sala';
import { SalaService } from '../servicios/sala.service';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {

  public lista: Array<Sala>;
  public seleccionado: Sala = new Sala();

  @ViewChild(IonModal) modal: IonModal;
  name: string;
  salaServicio: any;
  item: any;

  cancel() {
    this.modal.dismiss(null, 'cancelar');
  }

  confirm() {
    this.modal.dismiss(this.name, 'guardar');
  }

  constructor(
    private router: Router
  ) { }

  ngOnInit() {
    this.obtenerSala();
  }

  obtenerSala(){
    this.salaServicio.obtenerSala().subscribe(
      res => {
        this.lista = res;
      },
      error => {

      }
    );
  }

  actualizarSala(){
    this.salaServicio.actualizarSala().subscribe(
      res => {
        this.lista = res;
      },
      error => {

      }
    );
  }

  guardarSala(){
    this.salaServicio.guardarSala().subscribe(
      res => {
        this.lista = res;
      },
      error => {

      }
    );
  }

  activarInactivar(){
    this.salaServicio.activarInactivar().subscribe(
      res => {
        this.lista = res;
      },
      error => {

      }
    );
  }

}

import { Component, ViewChild } from '@angular/core';
import { Router } from '@angular/router';

import { IonModal } from '@ionic/angular';
import { OverlayEventDetail } from '@ionic/core/components';
import { Sala } from '../modelos/Sala';
import { SalaService } from '../servicios/sala/sala.service';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {
  public lista: Array<Sala>;
  public seleccionado: Sala = new Sala();

  @ViewChild(IonModal) modal: IonModal;
  name: string;
  salaServicio: any;

  cancel() {
    this.modal.dismiss(null, 'cancelar');
  }

  confirm() {
    this.modal.dismiss(this.name, 'guardar');
  }

  constructor(
    private router: Router
  ) { }

  ngOnInit() {
    this.obtenerSala();
  }

  obtenerSala(){
    this.salaServicio.obtenerSala().subscribe(
      res => {
        this.lista = res;
      },
      error => {

      },
      ()=>{

      }
    );
  }

}


