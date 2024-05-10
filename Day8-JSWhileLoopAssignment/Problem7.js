//Write a JavaScript program to reverse a given number.
var num = 625;
var rev = 0;
console.log("Number : "+num);
while(num>0){
    rev = rev*10+num%10;
    num=parseInt(num/10);
}
console.log("Reverser Number : "+rev);