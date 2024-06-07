/*
Problem 2:
Count Vowels and Consonants: Write a program to count the number of
vowels and consonants in a given string.
*/
var str = "HONESTY IS THE BEST POLICY";
var vowel = 0;
var consonants = 0;
for(let i=0;i<str.length;i++){
    if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' )
        vowel++;
    else
        consonants++;
}
console.log("String : "+str);
console.log("Total Vowel : "+vowel);
console.log("Total Consonants : "+consonants);