import { Component, OnInit } from '@angular/core';
import { CommandeStatusService } from 'src/app/shared/services/commande-status.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-commande-status',
  templateUrl: './commande-status.component.html',
  styleUrls: ['./commande-status.component.scss']
})
export class CommandeStatusComponent implements OnInit {

  listCommande: any[];
  constructor(private commandeStatusService: CommandeStatusService, private route: ActivatedRoute) { }

  ngOnInit() {
    let status = this.route.snapshot.paramMap.get('status');
    if (this.getStatus(status) == "") {
      this.commandeStatusService.getListCommande().subscribe(commande => {
        this.listCommande = commande;
      })
    }
    else
      this.commandeStatusService.getListCommandeByStatus(this.getStatus(status)).subscribe(commande => {
        this.listCommande = commande;
      })

  }

  getStatus(status) {
    switch (status) {
      case 'tous':
        return ""
        break;
      case 'enattente':
        return "en attente"
        break;
      case 'encours':
        return "en cours"
        break;
      case 'termine':
        return "termine"
        break;
      default: ""
    }
  }




}
