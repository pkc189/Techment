var Employee = /** @class */ (function () {
    function Employee(f, l, age) {
        this.firstName = f;
        this.lastName = l;
        this.age = age;
    }
    Employee.prototype.fullname = function () {
        return this.firstName + " " + this.lastName + " " + this.age;
    };
    return Employee;
}());
// creating obj here
var myEmp = new Employee("Raj", "Singh", 22);
console.log(myEmp.fullname());
