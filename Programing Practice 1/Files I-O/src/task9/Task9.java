/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

/**
 *
 * @author sezer
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task9 {

    public static void main(String[] args) {
        String name,ID;
        int grade;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter name (max 10 characters): ");
        name = scan.nextLine();
        boolean test = false;
        if (name.length() > 10) {
            System.out.println("You entered more than 10 characters enter name again (max 10 characters): ");
            name = scan.nextLine();
        }
        System.out.println("Enter ID (max 10 characters): ");
        ID = scan.nextLine();
        if (ID.length() > 10) {
            System.out.println("You entered more than 10 characters enter ID again (max 10 characters): ");
            ID = scan.nextLine();
        }
        System.out.println("Enter grade (between 0-100): ");
        grade = scan.nextInt();
        if (grade < 0 || grade > 100) {
            System.out.println("You entered invalid grade enter grade again (between 0-100): ");
        grade = scan.nextInt();
        }
        //System.out.println("Name: " + name + " ID: " + ID + " grade: " + grade);
        try {
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Name: " + name + " ID: " + ID + " grade: " + grade);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
        
        System.out.println("Reading from the file...");
        try {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        }
        myReader.close();
    }   catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    } 
}
