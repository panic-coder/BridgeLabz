import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from "@angular/material/icon";
// import { Ng5Module } from './ng5.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatMenuModule, MatButtonModule, MatCardModule, MatSidenavModule,MatListModule } from '@angular/material';
import { HeroService } from './hero.service';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SidenavComponent } from './sidenav/sidenav.component';

@NgModule({
    declarations:[
        AppComponent,
        HeaderComponent,
        SidenavComponent
    ],
    imports:[
        BrowserModule,
        FormsModule,
        HttpModule,
        BrowserAnimationsModule,
        MatToolbarModule,
        MatIconModule,
        MatMenuModule,MatButtonModule,MatCardModule,MatSidenavModule,MatListModule
    ],
    providers:[HeroService],
    bootstrap:[AppComponent]
})
export class AppModule{}