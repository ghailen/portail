import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard.component';
import { CommandActivityComponent } from './command-activity/command-activity.component';
import { CommandsViewComponent } from './commands-view/commands-view.component';
import { AlertsComponent } from './alerts/alerts.component';
import { ReportsComponent } from './reports/reports.component';
import { DashboardRoutingModulte } from './dashboard-routing.module';
import { NewsComponent } from './news/news.component';
import {MatButtonModule,MatIconModule} from '@angular/material';
import {MatBadgeModule} from '@angular/material/badge';


@NgModule({
  declarations: [DashboardComponent, CommandActivityComponent, CommandsViewComponent, AlertsComponent, ReportsComponent, NewsComponent],
  imports: [
    CommonModule,
    DashboardRoutingModulte,
    MatButtonModule,
    MatIconModule,
    MatBadgeModule
  ]
})
export class DashboardModule { }
