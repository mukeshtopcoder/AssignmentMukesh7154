//Write a JavaScript program to find the greatest common divisor (GCD) of two positive integers.
var num1 = 28;
var num2 = 21;
var hcf = 1;
var a = 1;
console.log("Number 1 : "+num1);
console.log("Number 2 : "+num2);
while(a<=num1){
	if(num1%a==0 && num2%a==0)
		hcf=a;
	a++;
}
console.log("HCF/GCD : "+hcf);