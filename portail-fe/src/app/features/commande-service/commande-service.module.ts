import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CommandeServiceComponent } from './commande-service.component';
import { FormGroup, FormControl,ReactiveFormsModule ,FormsModule} from '@angular/forms';
import { CommandeServiceRoutingModule } from './commande-service-routing.module';
import { MatButtonModule, MatIconModule } from '@angular/material';

@NgModule({
  declarations: [CommandeServiceComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    CommandeServiceRoutingModule,
    MatButtonModule,
    MatIconModule
  ]
})
export class CommandeServiceModule { 
}
