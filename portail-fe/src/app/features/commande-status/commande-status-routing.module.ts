import { NgModule } from '@angular/core';
import { Routes, RouterModule, ExtraOptions } from '@angular/router';
import { CommandeStatusComponent } from './commande-status.component';



const routes: Routes = [
  {path:'', component: CommandeStatusComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CommandeStatusRoutingModule {}