package ge.tbc.testautomation.introductionAndOOP;

public class Car {
    private double engine; // instance variable
    private String countryOfOrigin;
    private String brand;
    private String color;
    private String year;
    public static final double MAXIMUM_ENGINE_DISPLACEMENT;

    public void setEngine(double engine) {
        if (engine > MAXIMUM_ENGINE_DISPLACEMENT){
            System.out.println("DISPLACEMENT CANNOT BE MORE THAN 6.2");
            this.engine = MAXIMUM_ENGINE_DISPLACEMENT;
        }
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    static {
        MAXIMUM_ENGINE_DISPLACEMENT = 6.2;
    }

    public Car(double engine, String countryOfOrigin, String brand, String color, String year) {
        this.engine = engine;
        this.countryOfOrigin = countryOfOrigin;
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void revEngine(){
        System.out.println("RRRRRRRRRRRRRRRRRRRRR" + this.engine);
    }

    public static void dragRace(Car car1, Car car2){

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
