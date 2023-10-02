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
    
    public void multiplicar(){
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese 2 numeros");
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        int producto=numero1*numero2;
    }
    
    public void dividir(){
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese 2 numeros");
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        int division=numero1/numero2;
    }
            
    
}
