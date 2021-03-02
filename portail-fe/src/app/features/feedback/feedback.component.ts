import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { FeedbackServiceService } from 'src/app/shared/services/feedback-service.service';
@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.scss']
})
export class FeedbackComponent implements OnInit {

  constructor(private feedbackServiceService:FeedbackServiceService) { }

  ngOnInit() {
  }
  description = new FormControl('');

  feedbackData() {
    let feedbackBody =  {
      "description": this.description.value
   }
    return feedbackBody;
  }


  addFeedback() {
    this.feedbackServiceService.saveFeedback(this.feedbackData()).subscribe(
      (data: any) => {
      }

    )
  }
}
