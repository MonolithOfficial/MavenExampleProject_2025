package ge.tbc.testautomation.inheritanceAndPolymorphism;

public class Inheritance {
    public static void main(String[] args) {
        Square square = new Square(10);
        Shape shape = new Rectangle(10, 10);

        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}
