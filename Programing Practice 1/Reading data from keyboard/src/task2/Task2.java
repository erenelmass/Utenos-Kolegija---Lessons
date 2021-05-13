/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        double b;
        float c;
        System.out.println("Enter the first number: ");
        a = scan.nextInt();
        System.out.println("Enter the second number: ");
        b = scan.nextDouble();
        System.out.println("Enter the third number: ");
        c = scan.nextFloat();
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
