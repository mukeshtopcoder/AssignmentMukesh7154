/*
3. Array Intersection:
Write a program to find the intersection of two arrays (elements that are
common in both arrays) and store the result in a new array.
*/
var arr1 = [2,4,6,8,7,5,1,3];
var arr2 = [2,4,6,8,5,3,2,4];
for(let i=0;i<arr1.length;i++){
    for(let j=0;j<arr2.length;j++){
        if(arr1[i]==arr2[j])
            {
                console.log(arr1[i]);
                break;
            }
    }
}