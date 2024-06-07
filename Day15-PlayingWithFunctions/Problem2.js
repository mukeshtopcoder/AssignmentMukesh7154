/*
Problem 2:
Write a program to define a function that accepts two strings as parameters
and checks if one is an anagram of the other. Test the function with different
pairs of strings.
*/
function checkAnagram(str1,str2){
    var check = 0;
    if(str1.length==str2.length){
        for(let i=0;i<str1.length;i++){
            let count = 0;
            for(let j=0;j<str2.length;j++){
                if(str1.charAt(i)==str2.charAt(j))
                    {
                        check++;
                        count++;
                        str2=str2.substring(0,j)+'$'+str2.substring(j+1);
                        break;
                    }
            }
            if(count==0)
                return false;
        }
        if(str1.length==check)
            return true;
    }else{
        return false;
    }
}
if(checkAnagram('LISTEN','SILENT'))
    console.log("Anagram!");
else
    console.log("Not Anagram!");
if(checkAnagram('MUKESH','RAKESH'))
    console.log("Anagram!");
else
    console.log("Not Anagram!");
