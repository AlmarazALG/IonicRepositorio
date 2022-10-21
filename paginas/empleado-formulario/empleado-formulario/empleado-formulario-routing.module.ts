import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { EmpleadoFormularioPage } from './empleado-formulario.page';

const routes: Routes = [
  {
    path: '',
    component: EmpleadoFormularioPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class EmpleadoFormularioPageRoutingModule {}
