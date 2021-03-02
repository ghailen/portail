import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CommandeServiceService } from 'src/app/shared/services/commande-service.service';

@Component({
  selector: 'app-commande-service',
  templateUrl: './commande-service.component.html',
  styleUrls: ['./commande-service.component.scss']
})
export class CommandeServiceComponent implements OnInit {

  constructor(private commandeServiceService: CommandeServiceService, private route: ActivatedRoute,private router: Router) { }
  id: Number;
  name: string;
  ngOnInit() {
    this.id = parseInt(this.route.snapshot.paramMap.get('id'));
    this.name = this.route.snapshot.paramMap.get('name');
  }
  // information general
  commandName: string = "";
  projectMEP: string = "";
  project: string = "";
  environnement: string = "";
  usageEnvironnement: string = "";
  domain: string = "";

  //application emettrice
  partenaire: string = "";
  nomApplication: string = "";
  emailContact: string = "";
  codeBasicat: string = "";
  FtCartoNumber: string = "";

  //application emettrice
  partenaireExterne: string = "";
  emettreApplication: string = "";
  nomContact: string = "";
  mailContact: string = "";

  //Serveur Emetteur
  protocole: string = "";
  newServer: string = "";
  choiceServer: string = "";
  descriptionServer: string = "";
  reseauSupport: string = "";
  nbrIp: string = "";
  ip: string = "";
  password: string = "";

  createCommmandeData() {
    let CommandeDescription = {
      "name": this.commandName,
      "description": this.projectMEP,
      "status": "en attente",
      "action": null,
      "offreService":
      {
        "serviceId": this.id
      }
    }
    return CommandeDescription;
  }

  addCommande() {
    this.commandeServiceService.save(this.createCommmandeData()).subscribe(
      (data: any) => {
      }
    )
  }
}
