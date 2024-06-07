/*
Problem 3:
Check Palindrome: Write a program to check if a given string is a palindrome
(reads the same forwards and backwards). For example, "racecar" is a
palindrome.
*/
var str = "racecar";
var count = 0;
var start = 0;
var end = str.length-1;
while(start<end){
    if(str.charAt(start)!==str.charAt(end))
        {
            count++;
            break;
        }
    start++;
    end--;
}
console.log("String : "+str);
if(count==0)
    console.log("Palindrome!");
else
    console.log("Not Palindrome!");