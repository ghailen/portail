import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CommandeStatusRoutingModule } from './commande-status-routing.module';
import { CommandeStatusComponent } from './commande-status.component';
import {MatButtonModule,MatIconModule} from '@angular/material';

@NgModule({
  declarations: [CommandeStatusComponent],
  imports: [
    CommonModule,
    CommandeStatusRoutingModule,
    MatIconModule,
    MatButtonModule
  ]
})
export class CommandeStatusModule { }
