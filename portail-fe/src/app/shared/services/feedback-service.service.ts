import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FeedbackServiceService {

  constructor(private http: HttpClient) { }
  private _addFeedback='/api/feedback/save'

saveFeedback(feedbackData) : Observable<any>{
  return this.http.post<any>(this._addFeedback,feedbackData,{
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  })
}


}
