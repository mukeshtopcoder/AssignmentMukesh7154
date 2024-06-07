/*
Problem 7:
You are given an array of names containing a list of names. Your task is to count
the number of names that start with either 'N' or 'n'.
Input:
names = ["Nathan", "John", "Alice", "Nancy", "Bob"]
Output:
3
*/
var names = ["Nathan", "John", "Alice", "Nancy", "Bob"];
var count = 0;
for(let i=0;i<names.length;i++){
    if(names[i].charAt(0)=='N' ||names[i].charAt(0)=='n')
        count++;
}
console.log(names);
console.log("Output : "+count);