import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./tabs/tabs.module').then(m => m.TabsPageModule)
  },  {
    path: 'nombre',
    loadChildren: () => import('./nombre/nombre.module').then( m => m.NombrePageModule)
  },
  {
    path: 'nueva-pagina',
    loadChildren: () => import('./paginas/nueva-pagina/nueva-pagina.module').then( m => m.NuevaPaginaPageModule)
  },
  {
    path: 'empleado-formulario',
    loadChildren: () => import('./paginas/empleado-formulario/empleado-formulario/empleado-formulario.module').then( m => m.EmpleadoFormularioPageModule)
  },
  {
    path: 'post',
    loadChildren: () => import('./paginas/post/post/post.module').then( m => m.PostPageModule)
  },
  {
    path: 'post-detalle',
    loadChildren: () => import('./paginas/post-detalle/post-detalle/post-detalle.module').then( m => m.PostDetallePageModule)
  },
  {
    path: 'cine',
    loadChildren: () => import('./paginas/cine/cine/cine.module').then( m => m.CinePageModule)
  },
  {
    path: 'sala',
    loadChildren: () => import('./paginas/sala/sala/sala.module').then( m => m.SalaPageModule)
  }

];
@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
