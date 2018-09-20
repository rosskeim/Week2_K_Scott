/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author ggeaz
 */
public class SplitSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a 5-digit positive integer: ");
        int number = input.nextInt();
        int sum = 0;
        
        int remainder1 = sum + number /10000; 
        number = number % 10000;
        int remainder2 = sum + number /1000; 
        number = number % 1000 ;
        int remainder3 = sum + number /100;
        number = number % 100 ;
        int remainder4 = sum + number / 10; 
        number = number % 10;
        int remainder5 = number % 10;   
        
        sum = remainder1 + remainder2 + remainder3 + remainder4 + remainder5 ;
        
        System.out.print("The sum of the digits is " + remainder1); 
        System.out.print("+ " + remainder2);
        System.out.print("+ " + remainder3);
        System.out.print("+ " + remainder4);
        System.out.print("+ " + remainder5 + " = " + sum + "\n");        
        
        
          
    }
    
}

