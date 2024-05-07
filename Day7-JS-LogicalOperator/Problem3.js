/*Build an online shopping website that discounts orders. Customers are eligible for the discount if they purchase at least twocitems (numItems >= 2) and the total order value exceeds 5000c(totalOrderValue > 5000).*/
var numItems = 5;
var totalOrderValue = 8137;
if(numItems>=2 && totalOrderValue>=5000)
    console.log("You Got Discount!");
else
    console.log("No Discount!");