import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AlertsService {

  constructor(private http: HttpClient) { }

  private _updateStatusUrl="/api/commande/update/"
  private _deleteCommandeUrl="/api/commande/delete/"
  updateCommandeStatus(data){

    const requestBody ={
      "commandeId": data,
      "status": "en cours"
    }   
    //JSON.stringify(data);
    return this.http.put(this._updateStatusUrl+data,requestBody,{ headers: { 'Content-Type': 'application/json'}});
  }
  deleteCommande(data){
    return this.http.delete(this._deleteCommandeUrl+data);
  }

}
