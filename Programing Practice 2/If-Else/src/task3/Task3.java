/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author sezer
 */
import java.util.Scanner;
public class Task3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      int a,x,b,y,z;
      Scanner scan = new Scanner(System.in);
      System.out.println("y = ax²+b, x < 0  2x-1, x ≥ 0\nz = 2y");
      System.out.println("Enter the a: ");
      a = scan.nextByte();
      System.out.println("Enter the x: ");
      x = scan.nextByte();
      System.out.println("Enter the b: ");
      b = scan.nextByte();
        if (x < 0) {
            y = a * (x * x) + b;
        }
        else{
            y = (2 * x) - 1;
        }
        z = (2 * y);
        System.out.println("Result is: y= " + y + " z= "+ z);
    }
    
}
