package ge.tbc.testautomation.inheritanceAndPolymorphism;

public class Square extends Rectangle{
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
        getArea();
    }

    @Override
    public double getPerimeter(){
        return this.side * 4;
    }

    @Override
    public double getArea(){
        double area = Math.pow(this.side, 2);
        this.area = area;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                '}';
    }
}
