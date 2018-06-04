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

//Object.create
var personProto = {
  calculateAge: function(){
    console.log(2018 - this.yearOfBirth);
  }
}

var jane = Object.create(personProto);
jane.name = 'Jane';
jane.yearOfBirth = '1995';
jane.job = 'Teacher';

var mark = Object.create(personProto,{
  name : { value: 'Jane' },
  yearOfBirth : { value: 1960 },
  job : { value: 'Designer' }
});

console.log(mark);

//Primitives vs Objects

//Primitives
var a = 23;
var b = a;
a = 46;
console.log(a,b);

//Objects
var obj1 = {
  name: 'john',
  age: 26
};
var obj2 = obj1;
obj1.age = 30;
console.log(obj1,obj2);


//Fnctions
var age = 20;
var obj = {
  name:'Shubham',
  city: 'Mumbai'
};

function change(a,b){
  a = 30;
  b.city = 'Delhi';
}

change(age,obj);

console.log(age,obj.city);

//Passing functions as agruments
var years = [1994,1995,2003,2005,2012];

function arrayCalc(arr , fn){
  var arrRes = [];
  for (var i = 0; i < arr.length; i++) {
    arrRes.push(fn(arr[i]));
  }
  //console.log(arrRes);
  return arrRes;
}

function calculateAge(element){
  return 2018 - element;
}

function isFullAges(element){
  return element>=18;
}

function maxHeartRate(element){
  if(element>=18 && element<=81){
    return Math.round(206.9 - (0.67*element));
  }
  else {
    return -1;
  }
}

var a = arrayCalc(years, calculateAge);
var fullage = arrayCalc(a, isFullAges);
var maxheart = arrayCalc(a, maxHeartRate);
console.log(a);
console.log(fullage);
console.log(maxheart);

//Normal function
function game(){
  var score1 = Math.random()*10;
  console.log(score1);
}
game();

//IIFE immediately-invoked function expression
(function (goodluck){
  var score = Math.random()*10;
  console.log(score >= 5 - goodluck);
})(5);

console.log();

//Closure
function retirement(retirementAge){
  var a = 'years left';
  return function(yearOfBirth){
    var age = 2018 - yearOfBirth
    console.log((retirementAge - age), a);
  }
}

var retirementIN = retirement(60);
retirementIN(1995);
retirement(60)(1967);



;
