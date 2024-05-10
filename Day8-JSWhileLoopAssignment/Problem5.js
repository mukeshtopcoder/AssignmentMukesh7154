//Write a JavaScript program to find the sum of odd numbers from 1 to 50.
var range = 50;
var sum = 0;
var start = 1;
while(start<=range){
    if(start%2!=0)
        sum=sum+start;
    start++;
}
console.log("Addition of ODD Numbers From 1 To "+range+" is : "+sum);