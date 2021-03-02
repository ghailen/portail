import { NgModule } from '@angular/core';
import { Routes, RouterModule, ExtraOptions } from '@angular/router';
import { CommandeServiceComponent } from './commande-service.component';



const routes: Routes = [
{path:'',component: CommandeServiceComponent }
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CommandeServiceRoutingModule { }
