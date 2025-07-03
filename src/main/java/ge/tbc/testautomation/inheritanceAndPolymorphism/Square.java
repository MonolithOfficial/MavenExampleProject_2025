package ge.tbc.testautomation.inheritanceAndPolymorphism;

public class Square extends Rectangle{
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter(){
        return this.side * 4;
    }

    @Override
    public final double getArea(){
        return Math.pow(this.side, 2);
    }
}
