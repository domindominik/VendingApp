package main;

import java.util.List;

public class Loader
{
    private List<Product> productList;
    private List<Product> userProduct;
    private Vending vending;

    public Loader(Vending vending)
    {
        this.vending = vending;
    }

    public void loader(String name)
    {
        for (Product product: productList)
        {
            if (name.equals(product.getName()))
            {
                if (product.getPrices() <= vending.getAddingCoins())
                {
                    userProduct.add(product);
                    vending.setAddingCoins(vending.getAddingCoins() - product.getPrices());
                    vending.setToPay(vending.getToPay() + product.getPrices());
                }
            }
            if (vending.getAddingCoins() <= 0)
            {
                break;
            }


        }

    }
}
