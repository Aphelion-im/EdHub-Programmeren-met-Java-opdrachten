public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("André", "de Groot", new VisaCard(0));
        customer.getCreditCard().pay(100);
        customer.printName();
        System.out.println(customer.getCreditCard().getDebt());

        Customer customer2 = new Customer("Marcel", "de Groot", new MasterCard(0));
        customer2.getCreditCard().pay(100);
        customer2.printName();
        System.out.println(customer2.getCreditCard().getDebt());
    }
}
