/*
Problem 10:
Write a program to implement a function that simulates a simple calculator. The
function should take two numbers and an operator (+, -, *, /) as parameters and
return the result. Test the function with various calculations.
*/
function simpleCalculator(num1,num2,operator){
    var str = num1+""+operator+""+num2;
    return eval(str);
}
var num1 = 287;
var num2 = 286;
var operator = '+';
var result = simpleCalculator(num1,num2,operator);
console.log(num1+" "+operator+" "+num2+" = "+result);
num1 = 287;
num2 = 286;
operator = '-';
result = simpleCalculator(num1,num2,operator);
console.log(num1+" "+operator+" "+num2+" = "+result);
