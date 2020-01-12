package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Account;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char choice = sc.next().charAt(0);


        if(choice == 'y') {
            System.out.print("Enter deposit value: ");
            double balance = sc.nextDouble();
            account = new Account(number, holder, balance);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.printf("%n%nAccount data: %n");
        System.out.printf(account.toString() + "%n%n");

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.printf(account.toString() + "%n%n");

        System.out.print("Enter a witdraw value: ");
        account.witdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.printf(account.toString() + "%n%n");

        sc.close();

    }

}