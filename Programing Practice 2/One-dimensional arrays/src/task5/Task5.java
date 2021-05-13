/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author sezer
 */
import java.util.Scanner;
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static int getMax(int[] inputArray)
    { 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
    }
    
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = scan.nextInt();
        int[] myList = new int[size];
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < size; i++) {
            myList[i] = scan.nextInt();
        }
        System.out.println("Array's elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(myList[i]);
        }
        int max = getMax(myList);
        System.out.println("Max value is: " + max);
    }
    
}
