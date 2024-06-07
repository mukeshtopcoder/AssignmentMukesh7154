/*
1. Find the Smallest and Largest Elements:
Write a program to find and display both the smallest and largest elements in an
array without sorting the array.
*/
var arr = [23,56,67,62,43,23,2,54,24,45,23,24,23];
var min = arr[0];
var max = arr[0];
for(let i=0;i<arr.length;i++){
    if(min>arr[i])
        min=arr[i];
    if(max<arr[i])
        max=arr[i];
}
console.log("Minimum Value : ",min);
console.log("Maximum Value : ",max);