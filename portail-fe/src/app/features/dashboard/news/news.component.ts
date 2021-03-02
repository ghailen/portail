import { Component, OnInit } from '@angular/core';
import { NewsService } from 'src/app/shared/services/news.service';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.scss']
})
export class NewsComponent implements OnInit {

  newsData: any[];

  constructor(private newsService :NewsService ) { }

  ngOnInit() {
this.newsService.getNews().subscribe(news=>{
this.newsData=news;
})
  }



}
