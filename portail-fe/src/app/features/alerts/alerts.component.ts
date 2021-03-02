import { Component, OnInit } from '@angular/core';
import { CommandeStatusService } from 'src/app/shared/services/commande-status.service';
import { AlertsService } from 'src/app/shared/services/alerts.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.scss']
})
export class AlertsComponent implements OnInit {

  constructor(private commandeStatusService:CommandeStatusService,private alertsService:AlertsService,private route: ActivatedRoute) { }
  commandeEnAttente : any [];
  commandeEnEchec : any [];
  name : string;
  ngOnInit() {
    this.commandeStatusService.getListCommandeByStatus("en attente").subscribe(commande =>{
      this.commandeEnAttente=commande;
    })

    this.commandeStatusService.getListCommandeByStatus("echec").subscribe(commande =>{
      this.commandeEnEchec=commande;
    })

    this.name = this.route.snapshot.paramMap.get('name');
  }

  updateStatusCommande(data,i){
    this.alertsService.updateCommandeStatus(data).subscribe(response => {
      console.log( response);
      this.commandeEnAttente.splice(i, 1);
    })
  }

  deleteCommande(data,i){
this.alertsService.deleteCommande(data).subscribe(response => {
  console.log( response);
  this.commandeEnAttente.splice(i, 1);
})
  }

  
}
