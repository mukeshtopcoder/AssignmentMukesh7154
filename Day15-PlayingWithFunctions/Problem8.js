/*
Problem 8:
Write a program to implement a function that calculates the area of a circle. The
function should take the radius as a parameter and return the area. Test the
function with different radius values.
*/
function areaCircle(radius){
    return 3.14*radius*radius;
}
let radius = 5;
let area = areaCircle(radius);
console.log("Radius : "+radius);
console.log("Area : "+area);
radius = 10;
area = areaCircle(radius);
console.log("-------------------\nRadius : "+radius);
console.log("Area : "+area);
