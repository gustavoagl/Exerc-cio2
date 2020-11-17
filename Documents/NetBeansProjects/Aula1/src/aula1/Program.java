/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Program {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        Funcionario emp = new Funcionario();
        
            System.out.print("name:  ");
            emp.nome = sc.nextLine();
            System.out.print("salarioBruto:  ");
            emp.salarioBruto = sc.nextDouble();
            System.out.print("taxa:  ");
            emp.taxa = sc.nextDouble();
            
            System.out.println("");
            System.out.println("Funcionario:  " + emp);
            System.out.println("");
            System.out.println("Qual é a porcentagem para aumentar o salário?");
            double percentage = sc.nextDouble();
            emp.AumentoSalario(percentage);
          
            System.out.println("");
            System.out.println("Atualizar data:  " + emp);
            sc.close();
        }
}
