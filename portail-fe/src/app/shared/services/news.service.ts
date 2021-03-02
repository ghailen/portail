import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class NewsService {

  private _newsUrl = '/api/news/findAll';
  constructor(private http: HttpClient) { }

  getNews() : Observable<any[]>{
    return this.http.get<any[]>(this._newsUrl);
  }


}
