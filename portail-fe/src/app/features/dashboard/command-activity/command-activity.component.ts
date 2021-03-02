import { Component, OnInit, Input } from '@angular/core';
import { OffreServiceService } from 'src/app/shared/services/offre-service.service';
import { DataServiceService } from 'src/app/shared/services/data-service.service';

@Component({
  selector: 'app-command-activity',
  templateUrl: './command-activity.component.html',
  styleUrls: ['./command-activity.component.scss']
})
export class CommandActivityComponent implements OnInit {
  listOffreData : any [];
  constructor(private offreServiceService:OffreServiceService,private data:DataServiceService) { }

  ngOnInit() {

    this.offreServiceService.getOffreListServices().subscribe(offresList=>{
      this.listOffreData=offresList;  
      })
       
  }


}
