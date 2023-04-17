package com.mycompany.quanlygiaydep;
import java.util.Scanner;

public class Main 
{
    public static void Main(String[] arg)
    {
        Scanner sc = new Scanner (System.in);   
        
        List 1 = new List () ;

        int chon;
        do
        {
            System.out.println("Quan li kho giay dep");        
            
            chon= sc.nextInt();
                      
                if(chon !=0)
                    
                { switch (chon)
                {
                    case 1 : 1 . menu() ; break ;                
                }
                }
        }
        while(chon !=0);
    }
}
