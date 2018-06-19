import { Component, Input, HostListener, ChangeDetectorRef } from "@angular/core";
import { SidenavComponent } from "../sidenav/sidenav.component";
import {MediaMatcher} from '@angular/cdk/layout';



@Component({
    selector:'app-header',
    templateUrl:'./header.component.html',
    styleUrls:['./header.component.css']
})
export class HeaderComponent{
    //mobileQuery: MediaQueryList;
     fillerNav : any ; 
    
    

    fillerContent = 
        ``;
       
        constructor(){
           let array = [];   
           for (let index = 0; index < 5; index++) {
               array.push(index);
         }
         this.fillerNav = array
         console.log(this.fillerNav);
        }
        //  ngOnDestroy(): void {
        //    this.mobileQuery.removeListener(this._mobileQueryListener);
        //  }
}