import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { Post } from 'src/app/modelos/post';
import { PostService } from 'src/app/servicios/post.service';
import { Empleado } from 'src/app/modelos/Empleado';
import {LoadingController} from "@ionic/angular";

@Component({
  selector: 'app-post-detalle',
  templateUrl: './post-detalle.page.html',
  styleUrls: ['./post-detalle.page.scss'],
})
export class PostDetallePage implements OnInit {

  public  id: string;
  public  loader = false;
  public post: Empleado = new Empleado();

  constructor(
    private postServicio: PostService,
    private url: ActivatedRoute,
    private router: Router,
    private loadingCtrl: LoadingController
  ) { }

  ngOnInit() {
    this.url.params.subscribe(
      res =>{
        this.id = res.id;
      }
    );
    this.obtenerPost();
  }

  obtenerPost(){
    this.postServicio.obtenerPost(this.id).subscribe(
      res => {
        this.post =res;
      }
    );
  }

  irAmodificar() {
    this.router.navigate(['/empleado-formulario'], {queryParams: this.post} );
  }

  activarDesactivar() {
    this.showLoading();
    this.postServicio.activarInactivar(this.post.empleadoId).subscribe(
      respuesta => {
        console.log("correcto....", respuesta);
        this.post.activo = !this.post.activo;
      },
      error => {
        console.log("Ocurrio un error al modifacar el registro", error);
      },
      () => {
        this.loader = false;
      }
    );
  }

  async showLoading() {
    const loading = await this.loadingCtrl.create({
      message: 'Dismissing after 3 seconds...',
      duration: 3000,
    });

    loading.present();
  }

}
