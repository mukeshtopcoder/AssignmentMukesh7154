//Write a JavaScript program to find the sum of all prime numbers less than 100.
var num = 2;
var sum = 0;
while(num<=100){
    let a = 2;
    let count = 0;
    while(a<=num/2){
        if(num%a==0)
            {
                count++;
                break;
            }
        a++;
    }
    if(count==0)
        sum=sum+num;
    num++;
}
console.log("Sum Of All Prime Numbers From 1 to 100 : "+sum);