/*
5. Remove Duplicates:
Write a program to remove duplicate elements from an array without using
built-in methods.
*/
var arr = [2,4,5,6,4,3,2,3,4,5,3,4,5,3];
for(let i=0;i<arr.length;i++){
    for(let j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j])
            arr[j]=-1;
    }
}
for(let i=0;i<arr.length;i++){
    if(arr[i]!=-1)
        console.log(arr[i]);
}