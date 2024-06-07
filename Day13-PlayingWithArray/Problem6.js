/*
6. Array Filtering:
Write a program to filter out even and odd numbers from an array and create
two separate arrays for even and odd numbers.
*/
var arr = [2,5,7,78,54,43,5,7,9,54,23,45];
var even = [];
var odd = [];
var ev = 0;
var od = 0;
for(let i=0;i<arr.length;i++){
    if(arr[i]%2==0){
        even[ev]=arr[i];
        ev++;
    }
    else{
        odd[od]=arr[i];
        od++;
    }
}
console.log("Even Number : ");
for(let i=0;i<even.length;i++)
    console.log(even[i]);
console.log("Odd Number : ");
for(let i=0;i<odd.length;i++)
    console.log(odd[i]);