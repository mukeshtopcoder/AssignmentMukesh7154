var total = 45;
var loyalty = true;
var distance = 3;
if(total>50){
    console.log("Delivery is FREE!");
}else{
    if(loyalty){
        console.log("Delivery is Free!");
    }else{
        if(distance<5){
            console.log("Delivery is Free!");
        }else{
            console.log("Paid Delievery!");
        }
    }
}