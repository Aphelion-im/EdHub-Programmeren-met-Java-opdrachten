public class Main {
    public static void main(String[] args) {

        Car fiat = new Car("Fiat", "500", 2019, "groen", 1.4);
        Car toyota = new Car("Toyota", "Aygo", 2016, "blauw", 1.2);
        Car volvo = new Car("Volvo", "CX90", 2022, "zwart", 2.0);

        toyota.displayMessage();
        fiat.displayMessage();
        volvo.displayMessage();


    }


}


