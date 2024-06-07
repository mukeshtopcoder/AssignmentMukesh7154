/*
Problem 6:
Write a program to define a function that accepts a string and a character as
parameters and counts the number of occurrences of that character in the
string. Test the function with different inputs.
*/
function countCharOccurancy(str,ch){
    let count = 0;
    for(let i=0;i<str.length;i++)
        if(str.charAt(i)==ch)
            count++;
    return count;
}
var str = "aman is a angular developer";
var ch = 'a';
var count = countCharOccurancy(str,ch);
console.log("String : "+str);
console.log("Occurancy of "+ch+" is : "+count);
str = "abhishek is hypertext";
ch = 'h';
var count = countCharOccurancy(str,ch);
console.log("String : "+str);
console.log("Occurancy of "+ch+" is : "+count);