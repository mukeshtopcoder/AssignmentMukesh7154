/*
1. Write a program to create an object representing a bank account with
properties like account number, account holder name, balance, and
methods for deposit and withdrawal. Ensure proper validation for
withdrawal to prevent overdraft.
*/
var bankAcc = {
    accountNumber : "7364262324345",
    accHolderName : "Rajesh Kumar",
    accBalance : 34252,
    checkBalance : function (){
        console.log("Current Balance : "+bankAcc.accBalance);
    },
    deposit : function (amt){
        console.log("Deposit Amount : "+amt);
        bankAcc.accBalance+=amt;
        console.log("Deposit Successfully!");
        bankAcc.checkBalance();
    },
    withdrawal : function (amt){
        console.log("Withdrawal Amount : "+amt);
        if(amt<=bankAcc.accBalance)
            {
                bankAcc.accBalance-=amt;
                console.log("Withdrawal Sucessfully!");
                bankAcc.checkBalance();
            }else{
                console.log("Insufficient Balance!");
                bankAcc.checkBalance();
            }
    }
};
bankAcc.checkBalance();
bankAcc.deposit(2643);
bankAcc.withdrawal(81625);