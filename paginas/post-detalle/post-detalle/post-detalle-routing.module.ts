import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PostDetallePage } from './post-detalle.page';

const routes: Routes = [
  {
    path: '',
    component: PostDetallePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PostDetallePageRoutingModule {}
