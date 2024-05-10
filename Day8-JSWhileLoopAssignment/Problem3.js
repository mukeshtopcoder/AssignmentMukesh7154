//Write a JavaScript program to calculate the factorial of a given number.
var num = 6;
var fact = 1;
var a = 1;
while(a<=num){
    fact=fact*a;
    a++;
}
console.log("Number : "+num)
console.log("Factorial : "+fact);