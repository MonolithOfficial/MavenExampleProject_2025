package ge.tbc.testautomation.inheritanceAndPolymorphism;

public class MethodOverloading {
    public static Gun shoot(Gun gun){
        System.out.println("SHOOT BULLETS");
        return new Gun();
    }

    public static void shoot(Ball gun){
        System.out.println("Just threw a ball");
    }

    public static void main(String[] args) {
//        Gun gun = shoot(new Gun);
//        shoot(new Gun);
    }
}
