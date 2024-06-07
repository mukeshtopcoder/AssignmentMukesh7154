/*
Problem 7:
Write a program to create a function that accepts two arrays and merges them
into a single array. Test the function with arrays of different lengths.
*/
function concatArray(arr1,arr2){
    var arr3 = [];
    var m = 0;
    for(let i=0;i<arr1.length;i++)
        arr3[m++]=arr1[i];
    for(let i=0;i<arr2.length;i++)
        arr3[m++]=arr2[i];
    return arr3;    
}
var arr1 = [23,76,15,92,64,37];
var arr2 = [32,81,53,81];
var arr3 = concatArray(arr1,arr2);
console.log("Array 1 : "+arr1);
console.log("Array 2 : "+arr2);
console.log("Concatenate Array1+Array2 : "+arr3);