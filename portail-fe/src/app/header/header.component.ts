import { Component, ChangeDetectorRef } from '@angular/core';
import { Router } from '@angular/router';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { HeaderItem } from './model/header-item';
import { ChildActivationStart } from '@angular/router';
import { ActivationStart } from '@angular/router';
import { NavigationStart } from '@angular/router';
import { Input, ViewChild, ElementRef, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  //"boosted-4.3.1/img/ORANGE_LOGO_rgb.jpg"
  iconPath: string = "images/Orange_Logo.png"
  items: HeaderItem[] = [];

  subItems: HeaderItem[] = [];

  constructor(router: Router) {
    router.events.subscribe(event => {
      if (event instanceof NavigationStart) {
        this.items.forEach(item => {
          if (event.url.indexOf("/" + item.link) == 0) {
            this.subItems = item.subItems;
          }
        });
      }
    });
  }

  ngOnInit() {
    this.items = [
      { name: "Portail - Commande Livraison des backups", link: "dashboard", label: "Dashboard" }
     /* { name: "Dashboard", link: "dashboard", label: "Dashboard" },
      { link: "start_planification", name: "Lancer une planification" },
      { link: "planification_status", name: "Statut des planifications" },
      {
        link: "pages",
        name: "Interventions planifiées",
        subItems: [
          { link: "pages/interventions_planifies", name: "Vue tabulaire" },
          { link: "agenda", name: "Vue agenda" },
          { link: "pages/planification_history/tournees", name: "Vue map" },
        ]
      },
      { link: "planification_history/clients", name: "Clients", },
      {
        link: "skills_management", name: "Compétences",
        subItems: [
          { link: "skills_management/techniciens", name: " Par Techniciens" },
          { link: "skills_management/materiels", name: "Par Materiels" }
        ]
      },
      { link: "validation_management", name: "Validations", }*/
    ];
  }

  @ViewChild('demo_navbar') nabBar: ElementRef;

}
