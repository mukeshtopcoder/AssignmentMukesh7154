/*
8. Filter Prime Numbers:
Write a program to filter out all prime numbers from an array and create a new
array with only the prime numbers.
*/
function prime(z){
    let count = 0;
    for(let num=2;num<z/2;num++)
        if(z%num==0){
            count++;
            return false;
        }
    return true;
}
var arr = [32,77,53,86,71,61,92,14,13];
for(let i=0;i<arr.length;i++){
    if(prime(arr[i]))
        console.log(arr[i]);
}