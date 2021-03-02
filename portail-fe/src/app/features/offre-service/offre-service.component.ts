import { Component, OnInit } from '@angular/core';
import { OffreServiceService } from 'src/app/shared/services/offre-service.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-offre-service',
  templateUrl: './offre-service.component.html',
  styleUrls: ['./offre-service.component.scss']
})
export class OffreServiceComponent implements OnInit {
message:string;

  offreData : any[];
  constructor(private offreServiceService:OffreServiceService,private route: ActivatedRoute) { }
 name : string;
 serviceId : Number;
  ngOnInit() {
    //let id = parseInt(this.route.snapshot.paramMap.get('id'));
    this.serviceId = parseInt(this.route.snapshot.paramMap.get('id'));
     this.name = this.route.snapshot.paramMap.get('name');
    this.offreServiceService.getOffreServices(this.serviceId).subscribe(offres=>{
      this.offreData=offres;
      });
  }

}
