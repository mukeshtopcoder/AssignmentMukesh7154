//Write a JavaScript program to convert a decimal number to binary.
var num = 13;
var bin = 0;
var a = 1;
console.log("Decimal Number : "+num);
while(num>0){
    bin = bin*10+num%2;
    num=parseInt(num/2);
}
var rev = 0;
while(bin>0){
    rev = rev*10+bin%10;
    bin = parseInt(bin/10);
}
console.log("Binary Number : "+rev);