import { Component, OnInit } from '@angular/core';
import { PostService } from 'src/app/servicios/post.service';
import { Post } from 'src/app/modelos/post';
import {Router} from "@angular/router";
import { Empleado } from 'src/app/modelos/Empleado';

@Component({
  selector: 'app-post',
  templateUrl: './post.page.html',
  styleUrls: ['./post.page.scss'],
})
export class PostPage implements OnInit {

  public lista: Array<Empleado>;
  public seleccionado: Post = new Post();

  constructor(
    private router: Router,
    private postServicios: PostService) { }

  ngOnInit() {
    this.obtenerPosts();
  }

  obtenerPosts(){
    this.postServicios.obtenerPosts().subscribe(
      res => {
        this.lista = res;
      },
      error => {

      },
      ()=>{

      }
    );
  }

  seleccionar(dato: Empleado) {
    this.router.navigate(['/post-detalle',dato.empleadoId]);
  }

}
