/*Create a program for a store that offers a discount on a purchase. To receive the discount, customers must have a valid membership card (hasMembershipCard) and spend more than 2000. */
var hasMembershipCard = true;
var balance = 2385;
if(hasMembershipCard && balance>2000)
    console.log("You Got A Discount Offer!");
else
    console.log("No Discount!");