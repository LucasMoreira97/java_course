package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        List<Product> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){

            System.out.println("Product #" + i + " data:");

            System.out.println("Common, used or imported (c/u/i) ?");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();


            if(ch == 'i'){

                System.out.print("Customs free: ");
                double customsFree = sc.nextDouble();

                Product dataProduct = new ImportedProduct(name, price, customsFree);
                list.add(dataProduct);

            }



            if(ch == 'c'){
                Product dataProduct = new Product(name, price);
                list.add(dataProduct);
            }




            if(ch == 'u'){

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                name += " (used)";

                Product dataProduct = new UsedProduct(name, price, date);
                list.add(dataProduct);
            }







        }

        System.out.println();
        System.out.println();

        System.out.println("PRICE TAGS: ");

        for(Product p: list){

            System.out.println(p.getName() + " $ " + p.getPrice() +  p.priceTag());

        }






        sc.close();






    }


}
