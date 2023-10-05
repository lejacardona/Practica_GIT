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
        Calculator calculadora=new Calculator(4, 2);
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        int suma=calculadora.sumar(num1, num2);
        System.out.println("La suma de los numeros es: "+suma);
        int resta=calculadora.restar(num1, num2);
        System.out.println("La resta de los numeros es: "+resta);
        int producto=calculadora.multiplicar(num1, num2);
        System.out.println("El producto de los numeros es: "+producto);
        double division=calculadora.dividir(num1, num2);
        System.out.println("La division de los numeros es: "+division);               
        
    }
    
    public int num1=4;
    public int num2=2;
    
    public Calculator(int num1,int num2) {  
    }   
    
    public int sumar(int num1,int num2){        
        int suma= num1+num2; 
        return suma;
    }
    
    public int restar(int num1,int num2){        
        int resta= num1+num2; 
        return resta;
    }

    public int multiplicar(int num1,int num2){
        int producto=num1*num2;
        return producto;
    }
    
    public double dividir(int num1,int num2){        
        double division=(double) num1/num2;
        return division;
    }
            

    
}
