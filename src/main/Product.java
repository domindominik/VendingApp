package main;

public class Product
{
    private String name;
    private int prices;

    public Product(String name, int prices)
    {
        this.name = name;
        this.prices = prices;
    }

    public String getName()
    {
        return name;
    }

    public int getPrices()
    {
        return prices;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrices(int prices)
    {
        this.prices = prices;
    }

    public void printInfo()
    {
        System.out.println("Product name: " + name +
                ", Price: " + prices);
    }
}
