import { NgModule } from '@angular/core';
import { Routes, RouterModule, ExtraOptions } from '@angular/router';
import { CommandeDataComponent } from './commande-data.component';



const routes: Routes = [
  {path:'', component:CommandeDataComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CommandeDataRoutingModule {}