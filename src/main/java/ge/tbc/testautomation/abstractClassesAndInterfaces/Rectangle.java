package ge.tbc.testautomation.abstractClassesAndInterfaces;

public class Rectangle extends Shape implements IRecolorable, IResizable, Comparable {
    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    public void printName(){
        System.out.println("RECTANGLE");
    }

    @Override
    public void recolor() {
        System.out.println("RECOLOR HAPPENED");
    }

    @Override
    public void resize(int byValue) {

    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Rectangle){
            Rectangle otherRectangle = (Rectangle) o;
            if (this.sideA == otherRectangle.sideA && this.sideB == otherRectangle.sideB){
                return 0;
            } else if (this.sideA < otherRectangle.sideA && this.sideB < otherRectangle.sideB) {
                return -1;
            }
            else {
                return 1;
            }
        }
        return -1;
    }
}
