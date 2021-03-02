import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatButtonModule,MatIconModule} from '@angular/material';
import { OffreServiceComponent } from './offre-service.component';
import { offreServiceRoutingModule } from './offre-service-routing.module';

@NgModule({
  declarations: [OffreServiceComponent],
  imports: [
    CommonModule,
    MatButtonModule,
    MatIconModule,
    offreServiceRoutingModule,
    
  ]
})
export class OffreServiceModule { }
