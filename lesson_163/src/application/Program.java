package application;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 980.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 70.00, 400.00));
        list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Ana", 800.00, 500.00));


        double sum = 0.00;
        for(Account acc : list){

            sum+= acc.getBalance();

        }


        System.out.printf("Total balance: %.2f%n ", sum);

        for(Account acc : list){

           acc.deposit(10.00);

        }


        for(Account acc : list){

            System.out.println(acc.getBalance());

        }




    }
}