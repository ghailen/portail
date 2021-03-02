import { NgModule } from '@angular/core';
import { Routes, RouterModule, ExtraOptions } from '@angular/router';


const routes: Routes = [
{path:'dashboard',loadChildren:'src/app/features/dashboard/dashboard.module#DashboardModule'},
{path:'offre/:id/:name',loadChildren:'src/app/features/offre-service/offre-service.module#OffreServiceModule'},
{path:'commande/:name/:id', loadChildren: 'src/app/features/commande-service/commande-service.module#CommandeServiceModule'},
{path:'listCommande/:status', loadChildren: 'src/app/features/commande-status/commande-status.module#CommandeStatusModule'},
{path:'alerts/:name', loadChildren: 'src/app/features/alerts/alerts.module#AlertsModule'},
{path:'feedback', loadChildren: 'src/app/features/feedback/feedback.module#FeedbackModule'},
{path:'donneeCommande/:id', loadChildren: 'src/app/features/commande-data/commande-data.module#CommandeDataModule'}
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
