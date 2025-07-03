package ge.tbc.testautomation.introductionAndOOP;

public class OOP {
    public static void main(String[] args) {
        Car audi = new Car(4.2, "germany",
                "audi", "black", "2006");

        Car audi2 = new Car(4.2, "germany",
                "audi", "black", "2006");

        System.out.println(audi.MAXIMUM_ENGINE_DISPLACEMENT);
//        audi = audi2;
        System.out.println(audi2.equals(audi));
    }
}
