interface Person{
  firstName:string,
  lastName:string,
  age:number
}

class Employee implements Person{
    firstName:string;
    lastName:string;
    age:number;



   

constructor(f:string,l:string,age:number){
    this.firstName=f;
    this.lastName=l;
    this.age=age;
}


fullname=()=>{
    return this.firstName + " " + this.lastName+" "+ this.age;
}



}

// creating obj here
let myEmp = new Employee("Raj","Singh",22);

console.log(myEmp.fullname())