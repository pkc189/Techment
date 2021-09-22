var Student = /** @class */ (function () {
    function Student(code, name) {
        this.studName = name;
        this.studCode = code;
    }
    Student.prototype.getGrade = function () {
        return "A+";
    };
    return Student;
}());
var tuple;
console.log(tuple.length);
var obj = new Student(101, "Pankaj");
var ar = [6, true, "uuu",];
console.log(obj.getGrade());
