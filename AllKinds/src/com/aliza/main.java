package com.aliza;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        food menu = new food();
        menu.intro();
        
        while(true)
        {
        System.out.print("Order? Y/N  ");
        String c = s.nextLine();
        String c1 = "Y";
        String c2 = "N";
        
        
        if(c.equals(c1))
        {
            menu.compute();
        }
        else if(c.equals(c2))
        {
            System.out.println("Total: P" +menu.Total);
            System.out.print("Enter Cash: ");
            double cash = s.nextInt();
            
            double change = cash - menu.Total;
            System.out.println("Your change is P" +change);
            break;
            
        }
        
        }
        
        
    }
}
