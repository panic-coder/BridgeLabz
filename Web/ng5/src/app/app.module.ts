import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from "@angular/material/icon";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatMenuModule,MatInputModule, MatButtonModule, MatCardModule, MatSidenavModule,MatListModule } from '@angular/material';
import { HeroService } from './hero.service';
import { Routes, RouterModule } from '@angular/router';
import { MatFormFieldModule } from '@angular/material/form-field';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { LoginComponent } from './login/login.component';

const appRoutes: Routes = [
    { path: '', component:LoginComponent },
    { path: 'header', component:HeaderComponent}
];

@NgModule({
    declarations:[
        AppComponent,
        HeaderComponent,
        SidenavComponent,
        LoginComponent
    ],
    imports:[
        BrowserModule,
        FormsModule,
        HttpModule,
        BrowserAnimationsModule,
        MatToolbarModule,
        MatIconModule,
        MatInputModule,
        MatMenuModule,MatButtonModule,MatCardModule,MatSidenavModule,MatListModule,
        RouterModule.forRoot(appRoutes),
        MatFormFieldModule,
        ReactiveFormsModule,
        
    ],
    providers:[HeroService],
    bootstrap:[AppComponent]
})
export class AppModule{}