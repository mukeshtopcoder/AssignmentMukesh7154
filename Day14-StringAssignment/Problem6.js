/*
Problem 6:
Write a JavaScript program that removes all occurrences of the character 'a'
from a given string.
*/
var str = "Raman is a js angular developer";
var tmp = "";
console.log("Strig : "+str);
for(let i=0;i<str.length;i++)
    if(str.charAt(i)!='a')
        tmp=tmp+str.charAt(i);
console.log("Removed Occurency 'a' : "+tmp);