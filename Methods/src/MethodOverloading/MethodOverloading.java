//A program to demonstrate method overloading by example of different payment methods available
package MethodOverloading;

import java.util.Scanner;

public class MethodOverloading {
    String un;
    String pwd;
    long cardNo;
    int cvv;
    String name;
    String expDate;
    long mobNo;

    // Constructor
    public MethodOverloading(String un, String pwd, long cardNo, int cvv, String name, String expDate, long mobNo) {
        this.un = un;
        this.pwd = pwd;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.name = name;
        this.expDate = expDate;
        this.mobNo = mobNo;
    }

    // Net banking
    void makePayment(String un, String pwd) {
        // Implementation for net banking
        System.out.println("Net banking payment made.");
    }

    // Paytm
    void makePayment(long mobNo) {
        // Implementation for Paytm
        System.out.println("Paytm payment made.");
    }

    // Credit/debit card
    void makePayment(long cardNo, int cvv, String name, String expDate) {
        // Implementation for credit/debit card
        System.out.println("Credit/debit card payment made.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for demonstration purposes
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Creating an instance of MethodOverloading with common data
        MethodOverloading m1 = new MethodOverloading(username, password, 0, 0, "", "", 0);

        // Making payments using different methods
        System.out.println("Choose the below option to make your payment");
        System.out.println("1. For Net Banking");
        System.out.println("2. For Paytm/Gpay/PhonePe");
        System.out.println("3. For Credit/debit card");

        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Taking input for Net Banking
            System.out.print("Enter card number: ");
            long cardNumber = sc.nextLong();
            System.out.print("Enter CVV: ");
            int cvv = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            m1.makePayment(username, password); // Net banking
        } else if (choice == 2) {
            // Taking input for Paytm
            System.out.print("Enter mobile number: ");
            long mobileNumber = sc.nextLong();
            m1.makePayment(mobileNumber); // Paytm
        } else if (choice == 3) {
            // Taking input for Credit/debit card
            System.out.print("Enter card number: ");
            long cardNumber = sc.nextLong();
            System.out.print("Enter CVV: ");
            int cvv = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Enter name on card: ");
            String cardName = sc.nextLine();
            System.out.print("Enter card expiration date: ");
            String expirationDate = sc.nextLine();
            m1.makePayment(cardNumber, cvv, cardName, expirationDate); // Credit/debit card
        }
    }
}
