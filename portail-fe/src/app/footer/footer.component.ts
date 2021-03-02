import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { HeaderItem } from '../header/model/header-item';
import { Router, NavigationStart } from '@angular/router';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent implements OnInit {

  
  iconPath: string = "images/Orange_Logo.png"
  items: HeaderItem[] = [];

  subItems: HeaderItem[] = [];

  constructor() {
   
  }

  ngOnInit() {
   
  }
}
