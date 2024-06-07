/*
Title Case a Sentence: Write a program to convert the first character of each
word in a sentence to uppercase and the rest to lowercase.
*/
var str = "computer primary memory is RAM";
var arr = str.split(" ");
var tmp = "";
for(let i=0;i<arr.length;i++){
    for(let j=0;j<arr[i].length;j++){
        if(j==0){
            if(arr[i].codePointAt(j)>91)
                tmp=tmp+String.fromCharCode(arr[i].codePointAt(j)-32);  
            else
                tmp=tmp+arr[i].charAt(j);
        }else{
            if(arr[i].codePointAt(j)<97)
                tmp=tmp+String.fromCharCode(arr[i].codePointAt(j)+32);  
            else
                tmp=tmp+arr[i].charAt(j);
        }
    }   
    tmp=tmp+" ";
}
console.log(tmp);