/*Program for a website login system. Users should be authenticated if they enter the correct username and password. If the user enters the wrong password (enteredPassword !== correctPassword),display an error message. Use the logical NOT operator to perform this check.*/
var enteredPassword = 7128;
var correctPassword = 7128;
var enteredID = "admin@gmail.com";
var correctID = "admin@gmail.com";
if( !(enteredPassword !== correctPassword && enteredID !== correctID) )
    console.log("You Are Logged In!");
else
    console.log("Either UserID or Password is Incorrect!");