/*determine if a given temperature is within a comfortable range for outdoor activities. If the temperature is between 65°F and 85°F (temperature >= 65 && temperature <= 85), it's considered comfortable. If it's outside this range, it's either too hot or too cold for outdoor activities.*/
var temp = 76;
if(temp<65)
    {
        console.log("Its Too Cold!");
    }
else
    {
        if(temp>=65 && temp<=85)
            console.log("Comfortable Temperature!");
        else
            console.log("Its Too Hot!");
    }