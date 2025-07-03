package ge.tbc.testautomation.inheritanceAndPolymorphism;

public class Rectangle extends Shape{
    protected double sideA;
    protected double sideB;

//    public Rectangle(){
//
//    }

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getPerimeter(){
        return (sideA + sideB) * 2;
    }

    public double getArea(){
        return sideA * sideB;
    }

    public void rectangleSpecificBehavior(){
        System.out.println("I AM RECTANGLE");
    }
}
