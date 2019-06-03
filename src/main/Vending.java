package main;

import java.util.List;

public class Vending
{
    private List<Product> productList;
    private int addingCoins;
    private int toPay;

    public Vending(List<Product> productList)
    {
        this.productList = productList;
        this.addingCoins = 0;
        this.toPay = 0;
    }

    public List<Product> getProductList()
    {
        return productList;
    }

    public int getAddingCoins()
    {
        return addingCoins;
    }

    public int getToPay()
    {
        return toPay;
    }

    public void setProductList(List<Product> productList)
    {
        this.productList = productList;
    }

    public void setAddingCoins(int addingCoins)
    {
        this.addingCoins = addingCoins;
    }

    public void setToPay(int toPay)
    {
        this.toPay = toPay;
    }
}
