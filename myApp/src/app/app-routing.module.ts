import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { LogoutComponent } from './pages/logout/logout.component';
import { MainlayoutComponent } from './layout/mainlayout/mainlayout.component';
import { CasesComponent } from './pages/cases/cases.component';
import { CourtComponent } from './pages/court/court.component';


const routes: Routes = [
  {path:"",
  component:MainlayoutComponent,
  children:[
    {
      path:"",
      component:DashboardComponent
    },
    {
    path:"profile",
    component:ProfileComponent
  },
    {
    path:"Cases",
    component:CasesComponent
  },
    {
    path:"Court",
    component:CourtComponent
  },
  {
    path:"logout",
    component:LogoutComponent
  },
]

}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
