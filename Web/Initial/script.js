
console.log('Hello');

var name = 'Shubham!'; //String
console.log(name);

var n;
console.log(n); //undefined

var age = 24;
console.log(age); //float

var b = true;
console.log(b);

console.log(name + ' ' + age);
console.log(age + age);
// var nickname = prompt('Enter nickname');
// console.log(nickname);

var ageZ = 25;
var ageS = 20;
console.log((ageZ + ageS) * 4);


var name = 'Deepak';
var age = 24;
var isMarried = false;

if (isMarried) {
  console.log(name + " is married");
} else {
  console.log(name + " will hopefully marry soon =)");
}

if (23 === "23") {
  console.log("True");
} else {
  console.log("False");
}
var h1=165;
var h2=165;
var a1=24;
var a2=24;
if ((h1+a1*5)>(h2+a2*5)) {
    console.log('First Friend wins');
  }else if ((h1+a1*5)===(h2+a2*5)) {
    console.log('Its a tie');
  }
  else {
    console.log('Second Friend wins');
}

function add(a,b){
  var sum = a+b;
  return sum;
}
var sum1 = add(1,5);
var sum2 = add(5,9);
display(sum1);
display(sum2);
function display(sum){
  console.log(sum);
}
var p = 100;
someFun(p);
function someFun(p){
  console.log(p);
}

var names = ['john','kevin','jack'];
var years = new Array(1,2,3);
console.log(years[0]);
console.log(names[0]);
console.log(names.length);
names[1] = 'Ben';
console.log(names);

var john = ['John', 'Smith', 1999, 'Designer', false];
john.push('blue');
john.unshift('Mr. ')
john.pop();
john.shift();
console.log(john);

//alert(john.indexOf('Teacher'));

if (john.indexOf('Teacher') === -1) {
  console.log("John is not a Teacher");
} else {
  console.log('He is a Desiger');
}

var john = {
  name : 'John',
  lastName : 'Smith',
  yearOfBirth : 1990,
  job : 'Teacher',
  isMarried : false
};
console.log(john);
console.log(john.lastName);
console.log(john['lastName']);

var xyz = 'job';
console.log(john[xyz]);

john.lastName = 'Miller';
john.job = 'Programmer';
console.log(john);
var jane = new Object();
jane.name = 'Jane';
jane.lastName = 'Smith';
jane['yearOfBirth'] = 1970;
jane['job'] = 'retired';
jane['isMarried'] = true;

console.log(jane);
//v1.0
/*
var james = {
  name : 'James',
  lastName : 'Smith',
  yearOfBirth : 1990,
  job : 'Doctor',
  isMarried : false,
  family : ['Jane' , 'Mark' , 'Bob'],
  calculateAge : function(){
    return 2018 - this.yearOfBirth;
  }
};
*/

console.log(james);

//console.log(james.calculateAge(1990));
/*console.log(james.calculateAge());
var age = james.calculateAge();
james.age = age;
*/
//v2.0
var james = {
  name : 'James',
  lastName : 'Smith',
  yearOfBirth : 1990,
  job : 'Doctor',
  isMarried : false,
  family : ['Jane' , 'Mark' , 'Bob'],
  calculateAge : function(){
    this.age =  2018 - this.yearOfBirth;
  }
};


james.calculateAge();
console.log(james);

var mike = {
  name : 'Mike',
  lastName : 'Smith',
  yearOfBirth : 1950,
  job : 'Doctor',
  isMarried : false,
  family : ['Jane' , 'Mark' , 'Bob'],
  calculateAge : function(){
    this.age =  2018 - this.yearOfBirth;
  }
};


mike.calculateAge();
console.log(mike);


for(var i = 1;i<=10;i++){
  console.log(i);
}
console.log("00000000");
// var yearsArray = [2005,1994,1995,1996,2000];
// var ageArray = [];
// function calcAge(age){
//   return 2018-age;
// }
// for(var i=0;i<yearsArray.length;i++){
//   ageArray[i] = calcAge(yearsArray[i]);
//   //console.log(ageArray[i]);
//   if(ageArray[i]>=18){
//     console.log("Age "+ageArray[i]+" is eligible to vote");
//   }else{
//     console.log('Age '+ageArray[i]+' is not eligible to vote');
//   }
// }


calcAge(1995);
function calcAge(age) {
  console.log(2018-age);
}
console.log("(^_^)");

var a = 'A';
first();
function first(){
  var b = 'B';
  second();
  function second(){
    var c = 'C';
    third();
  }
}
function third(){
  var d ='D';
  console.log(a+d);
}


var jo ={
  name : 'John',
  year : 1990,
age :function(){
  console.log(this);
  console.log(2018-this.year);
  function addInner(){
    console.log(this);
  }
//  addInner();
}
}
jo.age();

var mi = {
  name :'Mike',
  year : 1999
};
mi.age = jo.age;
mi.age();
console.log("Done");
