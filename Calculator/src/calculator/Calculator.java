/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void sumar(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int suma= num1+num2;        
    }
    
    public void restar(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int resta= num1+num2;        
    }
    
}
