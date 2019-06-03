package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        List<Product> productList = new ArrayList<>();
        List<Product> userProduct = new ArrayList<>();
        productList.add(new Product("Snikers", 2));
        productList.add(new Product("Milk", 2));
        productList.add(new Product("Oreo", 2));
        productList.add(new Product("Milka", 2));
        productList.add(new Product("Sprite", 2));
        productList.add(new Product("Ice", 2));
        productList.add(new Product("Water", 2));
        productList.add(new Product("Orange", 2));
        productList.add(new Product("Knife", 2));
        productList.add(new Product("Weed", 2));

        Vending vendingApp = new Vending(productList);

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Insert coin: ");
            vendingApp.setAddingCoins(scanner.nextInt() + vendingApp.getAddingCoins());
            System.out.println("Amount paid: " + vendingApp.getAddingCoins());
            System.out.println("Stop? y[yes], n[no]");
            String stop = scanner.next();
            if (stop.equals("y"))
            {
                break;
            }

        }
        System.out.println("Your amount: " + vendingApp.getAddingCoins());


        Loader loader = new Loader(vendingApp);

        while (true)
        {
            System.out.println("Chose your product: ");
            String name = scanner.next();
            if (name.equals("stop"))
            {
                break;
            }
            else
            {
                loader.loader(name);
            }
        }









        for (Product product: userProduct)
        {
            product.printInfo();
        }
    }
}
