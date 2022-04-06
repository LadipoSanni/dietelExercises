package tddClass;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);

    private String accountNumber;
    private String firstName;
    private String lastName;
    String name = lastName + " " + firstName;   private int pin;

    public Account() {


    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        String name = firstName + " " + lastName;
        return name;
    }
}
