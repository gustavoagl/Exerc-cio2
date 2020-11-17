/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author gusta
 */
    public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;
    
    
    public double NetSalary(){
        return salarioBruto - taxa;
    }
    public void AumentoSalario(double percentage) {
        salarioBruto += salarioBruto * percentage/ 100.0;
        
    }
   public String toString(double percentage){
     return nome + ", $ " + String.format("%.2f", NetSalary());  
   }
    }

