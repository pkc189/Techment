import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }


  abc="blue";

other='red';

  user="Kamal"
  hasError=true;
  success="text-success";
  danger="text-danger";
  highlight="crimson"
  msgClass = {
    "text-success":!this.hasError,
    "text-danger":this.hasError,
    "warning":true,
    
  }

  classVariable="dummy"



  someStyle={
    fontSize:'78px',
    color:'green'

  }
  
  ngOnInit(): void {

   
  }

  
  greeting=""

  onClick(){
   this.greeting="Pankaj"
  }

  isLoggedIn = true;

  public arrColors = ['red', 'green', 'blue'];
  people: any[] = [
    {
      "name": "Pankaj"
    },
    {
      "name": "HEllo"
    },
    {
      "name": "three"
    },
    {
      "name": "four"
    },
    {
      "name": "five"
    }
  ];


}

class NgForExampleComponent {
  
}