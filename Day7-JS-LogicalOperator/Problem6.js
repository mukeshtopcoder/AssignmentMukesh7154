/*decide where to have dinner with your family. If your favorite restaurant has a discount (isSpecialOffer) or you're craving pizza (cravingPizza), choose one of those options; otherwise, cook dinner athome. Use the OR operator.*/
var isSpecialOffer = false;
var cravingPizza = false;
if(isSpecialOffer || cravingPizza)
    console.log("Goto Restaurent");
else
    console.log("Cook At Home!");