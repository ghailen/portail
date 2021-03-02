import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { FeedBackRoutingModule } from './feedback-routing.module';
import { FeedbackComponent } from './feedback.component';
@NgModule({
  declarations: [FeedbackComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    FeedBackRoutingModule
  ]
})
export class FeedbackModule { }
