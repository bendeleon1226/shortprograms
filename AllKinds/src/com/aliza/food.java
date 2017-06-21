package com.aliza;

import java.util.Scanner;

public class food
{
    Scanner scan = new Scanner(System.in);
    double MTotal = 0, Total;
    
    public void intro()
    {
        System.out.println("Enter 1 for M1 ---- P10.00");
        System.out.println("Enter 2 for M2 ---- P20.00");
        System.out.println("Enter 3 for M3 ---- P25.00");
    }
    
    
    public void compute()
    {
        
        
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
    
        
        switch(choice)
        {
            case 1:
            {
                MTotal = MTotal + 10;
                Total = MTotal;
                System.out.println(Total);
                break;
            }
            
            case 2:
            {
                MTotal = MTotal + 20;
                Total = MTotal;
                System.out.println(Total);
                break;
            }
            
            case 3:
            {
                MTotal = MTotal + 25;
                Total = MTotal;
                System.out.println(Total);
                break;
            }
            
            default:
            {
                System.out.println("Error");
                break;
            }
        }
    }
       
        
   
    
}
