/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author sezer
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 12;
        double b = 21.14;
        float c = 24.5f;
        System.out.println("A= " + a + " \nB= " + b + " \nC= " + c);
        System.out.println("=================\n RESULTS \n=================");
        System.out.println("A+B= " + (a + b));
        System.out.println("A+C= " + (a + c));
        System.out.println("A-B= " + (a - b));
        System.out.println("A-C= " + (a - c));
        System.out.println("A*B= " + (a * b));
        System.out.println("A*C= " + (a * c));
        System.out.println("A:B= " + (a / b));
        System.out.println("A:C= " + (a / c));
        System.out.println("=================\n AFTER FORMATING \n=================");
        System.out.println("A+B= " + (a + b));
        System.out.println("A+C= " + (a + c));
        System.out.println("A-B= " + (a - b));
        System.out.println("A-C= " + (a - c));
        System.out.println("A*B= " + (a * b));
        System.out.println("A*C= " + (a * c));
        System.out.println("A:B= " + String.format("%f",a / b));
        System.out.println("A:C= " + String.format("%f",a / c));
    }
    
}
