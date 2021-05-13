/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;
import java.util.Scanner;
abstract class celcius{
    abstract void convert();
}
class fahrenheit extends celcius{
    void convert(){
        System.out.print ("Converted to fahrenheit!");
    }
}
class kelvin extends celcius{
    void convert(){
        System.out.print ("Converted to kelvin!");
    }
}

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the celcius: ");
        int cel = scan.nextInt();
        double confah = cel * (1.8) + 32;
        double conkel = cel + 273.15;
        celcius obj = new fahrenheit();
        obj.convert();
        System.out.print(" " + cel + "°C = " + confah + "°F\n");
        celcius obj2 = new kelvin();
        obj2.convert();
        System.out.print(" " + cel + "°C = " + conkel + "°K\n");
    }
    
}
