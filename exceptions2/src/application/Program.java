package application;

import model.entities.Account;
import model.exceptions.BusinessExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");

        try {

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            String holder = sc.nextLine();
            sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter an amount to withdraw: ");
            double amount = sc.nextDouble();


            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n", acc.getBalance());

        } catch (BusinessExceptions e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }


        sc.close();


    }

}
