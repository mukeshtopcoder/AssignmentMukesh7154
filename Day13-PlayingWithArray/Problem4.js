/*
4. Array Palindrome:
Write a program to check if an array is a palindrome (reads the same forwards
and backwards).
*/
var arr = [2,4,6,8,6,4,2];
let start = 0;
let end = arr.length-1;
var flag = 1;
while(start<end){
    if(arr[start]!=arr[end]){
        flag=0;
        break;
    }
    end--;
    start++;
}
if(flag==1)
    console.log("Palindrome!");
else
    console.log("Not Palindrome!");