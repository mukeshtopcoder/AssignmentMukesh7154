// Write a JavaScript program to determine if a given number is prime or not.
var num = 53;
var a = 2;
var count = 0;
while(a<=num/2){
    if(num%a==0)
        {
            count++;
            break;
        }
    a++;
}
if(count==0)
    console.log("Prime Number!");
else
    console.log("Not Prime Number!");