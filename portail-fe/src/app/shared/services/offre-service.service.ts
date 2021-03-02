import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OffreServiceService {

  
  
  private _offresUrl = '/api/offreService/findByType/';
  private _ListeOffresUrl = '/api/typeService/findAll';

  constructor(private http: HttpClient) { }

  getOffreServices(typeId) : Observable<any[]>{
    return this.http.get<any[]>(this._offresUrl+typeId);
  }

  getOffreListServices() : Observable<any[]>{
    return this.http.get<any[]>(this._ListeOffresUrl);
  }

}
