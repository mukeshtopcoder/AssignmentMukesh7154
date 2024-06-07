/*
2. Sum of Two Arrays:
Write a program to add two arrays element-wise and create a new array with
the results.
*/
var arr1 = [12,34,55,65,34,12,4,67,89,56,23];
var arr2 = [34,7,43,7,43,56,87,43,65,87,45];
var arr3 = [];
for(let i=0;i<arr1.length;i++)
    arr3[i]=arr1[i]+arr2[i];
console.log(arr3);