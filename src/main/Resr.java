package main;

import java.util.ArrayList;
import java.util.List;

public class Resr
{
    private Vending vending;
    private int rest;

    public Resr(Vending vending)
    {
        this.vending = vending;
        this.rest = vending.getAddingCoins();
    }

    public String showCoins()
    {
        List<Integer> coins = new ArrayList<>();
        int[] matrix = {5, 2, 1};
        for (int i = 0; i < matrix.length; i++)
        {
            while (matrix[i] <= rest)
            {
                rest -= matrix[i];
                coins.add(matrix[i]);
            }
        }
        return coins.toString();
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
