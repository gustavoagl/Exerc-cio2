/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercicio2;

/**
 *
 * @author gusta
 */
public class CurrencyConverter {
        public static double IOF= 0.06;
        
        public static double dollarToReal(double amount, double dollarPrice) {
                return amount * dollarPrice* (1.0 + IOF);
        }
}
