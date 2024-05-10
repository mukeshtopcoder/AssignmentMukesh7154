//Write a JavaScript program to find the sum of digits of positive integers.
// 1 o 100
var range = 100;
var sum = 0;
var start = 1;
while(start<=range){
    sum=sum+start;
    start++;
}
console.log("Addition From 1 To "+range+" is : "+sum);