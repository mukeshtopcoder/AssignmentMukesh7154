/*
Problem 1:
Write a program to create a function that accepts an array of numbers and
returns a new array containing only the even numbers. Test the function with
different arrays.
*/
function evenArray(arr){
    var newArr = [];
    var m=0;
    for(let i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            newArr[m]=arr[i];
            m++;
        }
    }
    return newArr;
}
var arr = [23,45,6,78,7,675,445,3,23,34,4556,23];
console.log(arr);
var even = evenArray(arr);
console.log(even);