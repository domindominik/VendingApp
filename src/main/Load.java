package main;

import java.util.List;

public class Load
{
    private Vending vending;
    private List<Product> productList;
    private List<Product> userProduct;

    public Load(Vending vending, List<Product> productList, List<Product> userProduct)
    {
        this.vending = vending;
        this.productList = productList;
        this.userProduct = userProduct;
    }

    public void load(String name)
    {
        for (int i = 0; i < productList.size(); i++)
        {
            if (name.equals(productList.get(i).getName()))
            {
                if (productList.get(i).getPrices() <= vending.getAddingCoins())
                {
                    userProduct.add(productList.get(i));
                    vending.setToPay(vending.getToPay() + productList.get(i).getPrices());
                    vending.setAddingCoins(vending.getAddingCoins() - productList.get(i).getPrices());
                }
                if (productList.get(i).getPrices() > vending.getAddingCoins())
                {
                    System.out.println("Not enough $");
                }

            }
            if (vending.getAddingCoins() <= 0)
            {
                break;
            }
        }
    }
    public Vending getVending()
    {
        return vending;
    }

    public List<Product> getProductList()
    {
        return productList;
    }

    public List<Product> getUserProduct()
    {
        return userProduct;
    }

    public void setVending(Vending vending)
    {
        this.vending = vending;
    }

    public void setProductList(List<Product> productList)
    {
        this.productList = productList;
    }

    public void setUserProduct(List<Product> userProduct)
    {
        this.userProduct = userProduct;
    }
}
