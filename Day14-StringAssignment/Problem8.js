/*
Problem 8:
You are given a lowercase string input . Your task is to convert this string to
uppercase without using any built-in string methods.
Input:
input = "hello"
Output:
HELLO
*/
var str = "hello everyone";
var tmp = "";
console.log("String : "+str);
for(let i=0;i<str.length;i++){
    if(str.charCodeAt(i)>=97 && str.charCodeAt(i)<=122)
        tmp+=String.fromCharCode(str.charCodeAt(i)-32);
    else
        tmp+=str.charAt(i);
}
console.log("String : "+tmp);