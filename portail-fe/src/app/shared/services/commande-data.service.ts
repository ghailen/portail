import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CommandeDataService {

  constructor(private http:HttpClient) { }

  private _urlGetCommandById ='/api/commande/findById/'
  
  getCommandById(commandeDataId) : Observable<any[]>{
    return this.http.get<any[]>(this._urlGetCommandById+commandeDataId).pipe(map(commandeData => {
      let commandOne: any[] = [];
      commandeData.forEach(node => {
        commandOne.push(node.offreService);
      });
      console.log("commandOne",commandeData);
      return commandeData;
    }))
  }
  
}
