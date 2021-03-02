import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CommandeStatusService {

  private _urlListCommande='api/commande/findAll';
  private _urlListCommandeByStatus='api/commande/findByStatus/';
  constructor(private http: HttpClient) { }

  getListCommande(): Observable<any[]>{
    return this.http.get<any[]>(this._urlListCommande);
  }

  getListCommandeByStatus(status): Observable<any[]>{
    return this.http.get<any[]>(this._urlListCommandeByStatus+status);
  }


}
