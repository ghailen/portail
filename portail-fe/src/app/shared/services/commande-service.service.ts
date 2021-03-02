import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommandeServiceService {

  constructor(private http:HttpClient) { }

  private _urlSaveCommande ='api/commande/save'
  save(commandeDescription:any): Observable<any>
  {
    return this.http.post<any>(this._urlSaveCommande,commandeDescription,{
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    })
  }
}
