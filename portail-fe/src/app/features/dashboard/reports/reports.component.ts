import { Component, OnInit } from '@angular/core';
import { ReportServiceService } from 'src/app/shared/services/report-service.service';
import * as jsPDF from 'jspdf';
@Component({
  selector: 'app-reports',
  templateUrl: './reports.component.html',
  styleUrls: ['./reports.component.scss']
})
export class ReportsComponent implements OnInit {

  constructor(private reportServiceService: ReportServiceService) { }
  reportList: any[];
  ngOnInit() {
    this.reportServiceService.getReports().subscribe(reportList => {
    this.reportList = reportList;
    })
  }

  downloadPDF(){
const doc = new jsPDF();
doc.text('test',10,10);
doc.save('reports.pdf');
  }

}
