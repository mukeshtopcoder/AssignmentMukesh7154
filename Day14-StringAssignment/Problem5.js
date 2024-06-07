/*
Problem 5:
Day 14: String Assignment 2
Remove Duplicates: Write a program to remove duplicate characters from a
string while maintaining the original order. For example, "hello" becomes "helo".
*/
var str = "hello";
var tmp = "";
for(let i=0;i<str.length;i++){
    let flag = 0;
    for(let j=i+1;j<str.length;j++){
        if(str.charAt(i)==str.charAt(j))
            {
                flag++;
                break;
            }
    }
    if(flag==0)
        tmp=tmp+str.charAt(i);
}
console.log(tmp);