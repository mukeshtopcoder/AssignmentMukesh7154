/*
7. Filter Strings by Length:
Write a program to filter out all strings from an array that have a length greater
than a specified value.
*/
var arr = ["Raman","Ram","Divyam","Raju Singh","Shivani Bhatnagar","Shivam Rajpoot"];
var len = 5;
for(let i=0;i<arr.length;i++){
    if(arr[i].length>len)
        console.log(arr[i]);
}