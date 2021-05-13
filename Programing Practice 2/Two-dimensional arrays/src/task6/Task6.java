/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

/**
 *
 * @author sezer
 */
import java.util.Scanner;
public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the base of square matrix");
       n=sc.nextInt();
       int a[][]=new int[n][n];
       int b[][]=new int[n][n];
       int c[][]=new int[n][n];
       System.out.println("Enter the elements of matrix a");
       for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
    {
       a[i][j]=sc.nextInt();
    }
    }
       System.out.println("Enter the elements of matrix b");
       for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
    {
       b[i][j]=sc.nextInt();
    }
    }

    {
       for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
    {
       for(int k=0;k<n;k++)
    {
       c[i][j]=c[i][j]+a[i][k]*b[k][j];
    }
    }
    }
       System.out.println("the multiplied result is:");
       for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
    {
       System.out.print(c[i][j]+"   ");
    }
       System.out.println();
    }
    }
    
    }
    
}
