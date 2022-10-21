import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { EmpleadoFormularioPageRoutingModule } from './empleado-formulario-routing.module';

import { EmpleadoFormularioPage } from './empleado-formulario.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    EmpleadoFormularioPageRoutingModule
  ],
  declarations: [EmpleadoFormularioPage]
})
export class EmpleadoFormularioPageModule {}
