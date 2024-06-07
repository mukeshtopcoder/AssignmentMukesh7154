/*
Problem 9:
Write a program to define a function that accepts a string and removes all the
vowels from it. Test the function with different strings.
*/
function removeVowel(str){
    let tmp = "";
    for(let i=0;i<str.length;i++){
        if( !(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') )
            tmp=tmp+str.charAt(i);
    }
    return tmp;
}
var str = "abhishek is a angular developer";
var rem = removeVowel(str);
console.log("String : "+str);
console.log("Removed Vowel : "+rem);
str = "mohan is my friend";
rem = removeVowel(str);
console.log("-------------------\nString : "+str);
console.log("Removed Vowel : "+rem);