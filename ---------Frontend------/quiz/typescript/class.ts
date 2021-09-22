class Student {  
    studCode: number;  
    studName: string;  
  
    constructor(code: number, name: string) {  
            this.studName = name;  
            this.studCode = code;  
    }  
  
   getGrade() : string {  
        return "A+" ;  
    }  
}  

let tuple:["pk"]
console.log(tuple.length)

let obj = new Student(101,"Pankaj");  
  let ar:any= [6,true,"uuu",];
console.log(obj.getGrade());