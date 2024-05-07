var gender = 'male';
var age = 19;
if(gender == "female"){
    if(age>=18)
        console.log("Eligible For Marriage");
    else
        console.log("Not Eligible For Marriage");
}else if(gender == "male"){
    if(age>=21)
        console.log("Eligible For Marriage");
    else
        console.log("Not Eleigible For Marriage");
}else{
    console.log("Gender is Not Defined!");
}