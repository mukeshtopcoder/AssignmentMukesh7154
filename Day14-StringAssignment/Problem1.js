/*
Problem 1:
Reverse a String: Write a program to reverse a given string. For example, if the
input is "hello," the output should be "olleh."
*/
var str = "HELLO";
var temp = "";
for(let i=str.length-1;i>=0;i--)
    temp=temp+str.charAt(i);
console.log("String : "+str);
console.log("Reverse String : "+temp);