/*
Problem 3:
Write a program to define a function that takes a sentence as a parameter and
returns a new sentence with each word reversed. Test the function with various
sentences.
*/
function reverseEachWord(str){
    var arr = str.split(" ");
    var temp = "";
    for(let i=0;i<arr.length;i++){
        for(let j=arr[i].length-1;j>=0;j--)
            temp+=arr[i].charAt(j);
        temp+=" ";
    }
    return temp;
}
var s = reverseEachWord("Ram is A Good Boy");
console.log(s);