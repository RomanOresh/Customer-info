package app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();
        getOutput(output);
    }

    public static String[] getData() {
        return new String[]{"Roman", "+231451513515"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String formatted = String.format("Ваш запрос был создан: %s, \n%s", formater.format(new Date()), output);
        System.out.println(formatted);

    }
}
