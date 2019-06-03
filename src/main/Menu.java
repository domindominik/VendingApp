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
        productList.add(new Product("Snikers", 1));
        productList.add(new Product("Milk", 3));
        productList.add(new Product("Oreo", 4));
        productList.add(new Product("Milka", 5));
        productList.add(new Product("Sprite", 8));
        productList.add(new Product("Ice", 2));
        productList.add(new Product("Water", 7));
        productList.add(new Product("Orange", 1));
        productList.add(new Product("Knife", 9));
        productList.add(new Product("Weed", 2));

        Vending vending = new Vending(productList);

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Insert coin: ");
            vending.setAddingCoins(scanner.nextInt() + vending.getAddingCoins());
            System.out.println("Amount paid: " + vending.getAddingCoins());
            System.out.println("Stop? s[yes]");
            String stop = scanner.next();
            if (stop.equals("s"))
            {
                break;
            }

        }
        System.out.println("Your amount: " + vending.getAddingCoins());

        Load load = new Load(vending, productList,userProduct);

        for (Product product: productList)
        {
            product.printInfo();
        }
        while (true)
        {
            System.out.println("You have " + vending.getAddingCoins() + "$ Chose your product,\t s[stop]");
            String name = scanner.next();
            if (name.equals("s"))
            {
                break;
            }
            else
            {
                load.load(name);
            }
        }









        for (Product product: userProduct)
        {
            product.printInfo();
        }
    }
}
