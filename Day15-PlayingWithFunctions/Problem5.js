/*
Problem 5:
Write a program to implement a function that finds the largest element in an
array of numbers. Test the function with different arrays.
*/
function findLargest(arr){
    let max=arr[0];
    for(let i=0;i<arr.length;i++)
        if(max<arr[i])
            max=arr[i];
    return max;
}
var arr = [34,76,29,36,92,64,98,53,52];
var max = findLargest(arr);
console.log(arr);
console.log("Maximum Value : "+max);
arr = [75,27,286,487,143,927,365,262];
max = findLargest(arr);
console.log(arr);
console.log("Maximum Value : "+max);