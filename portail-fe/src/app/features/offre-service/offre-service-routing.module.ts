import { NgModule } from '@angular/core';
import { Routes, RouterModule, ExtraOptions } from '@angular/router';
import { OffreServiceComponent } from './offre-service.component';


const routes: Routes = [
  {path:'', component: OffreServiceComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class offreServiceRoutingModule {}