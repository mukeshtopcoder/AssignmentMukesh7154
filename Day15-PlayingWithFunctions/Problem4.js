/*
Problem 4:
Write a program to create a function that accepts a temperature in Celsius and
converts it to Fahrenheit. Test the function with different temperature values.
*/
function celToFahren(cel){
    var far = 9/5*cel+32;
    return far;
}
var cel = 96;
console.log("Temperature in Celcius : "+cel);
var far = celToFahren(cel);
console.log("Temperature in Fahrenheit : "+far);
cel = 44;
console.log("Temperature in Celcius : "+cel);
far = celToFahren(cel);
console.log("Temperature in Fahrenheit : "+far);