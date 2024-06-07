/*
2. Write a program to create an object representing a geometric shape (e.g.,
circle, rectangle) with properties like dimensions and methods for
calculating area and perimeter. Implement it in a way that accommodates
different shapes.
*/
const geometricShapes = {
    circle : {
            area : function(radius){
            return 3.14*radius*radius;
            },
            perimeter : function(radius){
            return 2*3.14*radius;
            }
    },
    rectangle : {
        area : function(length,width){
            return length*width;
        },
        perimeter : function(length,width){
            return 2*(length+width);
        }
    }
};
console.log("Circle Area : "+geometricShapes.circle.area(4));
console.log("Circle Perimeter : "+geometricShapes.circle.perimeter(4));
console.log("--------------------\nRectangle Area : "+geometricShapes.rectangle.area(4,5));
console.log("Reactangle Perimeter : "+geometricShapes.rectangle.perimeter(4,5));