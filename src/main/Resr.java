package main;

public class Resr
{
    private Vending vending;
    private int rest;

    public Resr(Vending vending)
    {
        this.vending = vending;
        this.rest = vending.getAddingCoins();
    }

    public Vending getVending()
    {
        return vending;
    }

    public int getRest()
    {
        return rest;
    }

    public void setVending(Vending vending)
    {
        this.vending = vending;
    }

    public void setRest(int rest)
    {
        this.rest = rest;
    }
}
