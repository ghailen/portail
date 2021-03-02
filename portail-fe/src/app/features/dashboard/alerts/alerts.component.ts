import { Component, OnInit } from '@angular/core';
import { CommandeStatusService } from 'src/app/shared/services/commande-status.service';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.scss']
})
export class AlertsComponent implements OnInit {

  constructor(private commandeStatusService:CommandeStatusService) { }
  commandeEnAttente : any [];
  countCommandeEnAttente : Number;
  commandeEnEchec : any [];
  countCommandeEnEchec : Number;
  ngOnInit() {
      // get number en commande en attente
    this.commandeStatusService.getListCommandeByStatus("en attente").subscribe(commande =>{
      this.commandeEnAttente=commande;
      this.commandeEnAttente.forEach( (myObject, index) => {
        this.countCommandeEnAttente = index+1;
        
      });
    })

    // get number en commande echec
    this.commandeStatusService.getListCommandeByStatus("echec").subscribe(commande =>{
      this.commandeEnEchec=commande;
      this.commandeEnEchec.forEach( (myObject, index) => {
        this.countCommandeEnEchec = index+1;
      });
    })

  }

}
