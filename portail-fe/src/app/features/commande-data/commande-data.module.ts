import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CommandeDataComponent } from './commande-data.component';
import { CommandeDataRoutingModule } from './commande-data-routing.module';

@NgModule({
  declarations: [CommandeDataComponent],
  imports: [
    CommonModule,
    CommandeDataRoutingModule
  ]
})
export class CommandeDataModule { }
