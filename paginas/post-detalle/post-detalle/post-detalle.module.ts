import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PostDetallePageRoutingModule } from './post-detalle-routing.module';

import { PostDetallePage } from './post-detalle.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PostDetallePageRoutingModule
  ],
  declarations: [PostDetallePage]
})
export class PostDetallePageModule {}
