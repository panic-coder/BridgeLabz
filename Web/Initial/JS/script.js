console.log("Hi");
// Function Constructor

var john = {
  name : 'John',
  yearOfBirth : 1990,
  job : 'Teacher'
};

//Function Constructor
var Person = function(name, yearOfBirth, job){
  this.name = name;
  this.yearOfBirth = yearOfBirth;
  this.job = job;
}

Person.prototype.calculateAge = function(){
  console.log(2018-this.yearOfBirth);
};

Person.prototype.lastName = 'Smith';

var shubham = new Person('Shubham', 1995, 'Engineer');
var jane = new Person('Jane', 1990, 'Designer');
var mark = new Person('Mark', 1980, 'Teacher');

shubham.calculateAge();
jane.calculateAge();
mark.calculateAge();

console.log(mark.lastName);
console.log(jane.lastName);
;
