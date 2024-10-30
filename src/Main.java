import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Semih Nebi","Tokalak"));
        customers.add(new Customer(2,"Cumhur Mesut","Tokalak"));
        customers.add(new Customer(3,"Emir Melih","Tokalak"));

        for (Customer customer : customers) {
            System.out.println(customer.name);
        }
        customers.remove(0);
        for (Customer customer : customers) {
            System.out.println(customer.name);
        }
    }
}