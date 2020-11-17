/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc= new Scanner(System.in);
            
            System.out.print("What is the dollar price? ");
            double dollarPrice= sc.nextDouble();
            System.out.print("How many dollars will be bought? ");
            double amount= sc.nextDouble();
            double result= CurrencyConverter.dollarToReal(amount, dollarPrice);
            System.out.printf("Amount to be paid in reais= %.2f%n", result);
            sc.close();
    }
    
}
