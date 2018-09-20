/* Progaram: Temperture Exercise
 * Temperture.java
 * Summary: User inputs Degrees F and gets Degree C and Vice Versa.
 * Author: Kriztofer Scott
* September 16 , 2018 
 */
package temperture;

import java.util.Scanner;

/**
 *
 * @author ggeaz
 */
public class Temperture {

    /**
     * Main Method is asking user for degrees and converting from F to C and versa. 
     */
   public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
       System.out.print("Enter a number in celsius");
        double C = input.nextDouble(); 
        
        double fah = (9.0/5.0)*celsius + 32; 
        System.out.println(celsius + " degree in Celsius is equal to " + fahrenheit + " in fahrenheit"); 

        
        
        
     
       
         
        
        
        
    }
}

 