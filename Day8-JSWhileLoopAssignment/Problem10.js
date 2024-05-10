//Write a JavaScript program to determine if a given string is a palindrome.
var str = "NAMAN";
var temp = "";
var a = str.length-1;
console.log("String : "+str);
while(a>=0){
    temp=temp+str.charAt(a);
    a--;
}
console.log("Reverse : "+temp);
if(str==temp)
    console.log("Palindrome!");
else
    console.log("Not Palindrome!");