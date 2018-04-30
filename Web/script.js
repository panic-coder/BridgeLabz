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
