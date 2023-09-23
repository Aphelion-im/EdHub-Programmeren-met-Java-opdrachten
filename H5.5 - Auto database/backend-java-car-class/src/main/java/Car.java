public class Car {
    String brand;
    String type;
    int year;
    String color;
    Double engine;

    public Car(String brand, String type, int year, String color, Double engine) {
        this.brand = brand;
        this.type= type;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public void displayMessage () {
        System.out.println("Deze " + this.brand + " " + this.type + " is " + this.color);
    }


}
