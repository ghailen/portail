import { Component, OnInit } from '@angular/core';
import { CommandeDataService } from 'src/app/shared/services/commande-data.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-commande-data',
  templateUrl: './commande-data.component.html',
  styleUrls: ['./commande-data.component.scss']
})
export class CommandeDataComponent implements OnInit {

  constructor(private commandeDataService:CommandeDataService,private route: ActivatedRoute) { }
id: Number;
commandeOne : any[];
  ngOnInit() {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.commandeDataService.getCommandById(this.id).subscribe(commande => {
  this.commandeOne = commande;

})
  }

}
