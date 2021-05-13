/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

/**
 *
 * @author sezer
 */
import java.util.Scanner;
public class Task7 {
  static void pascal() {
    int rows = 10, coef = 1;

    for(int i = 0; i < rows; i++) {
      for(int space = 1; space < rows - i; ++space) {
        System.out.print("  ");
      }

      for(int j = 0; j <= i; j++) {
        if (j == 0 || i == 0)
          coef = 1;
        else
          coef = coef * (i - j + 1) / j;

        System.out.printf("%4d", coef);
      }

      System.out.println();
    }
  }
  
    public static int binom(int n, int k) {
        if (k == n || k == 0)
            return 1;
        else return binom(n - 1, k - 1) + binom(n - 1, k);
    }
    public static void reversedPascal(int n) {
        boolean upsideDown = true;
        if (!upsideDown) {
            if (n < 0)
                return;
            reversedPascal(n - 1);
            System.out.println();
            for (int k = 0; k <= n; k++) {
                System.out.print(binom(n, k) + " ");
            }
        }
        if (upsideDown) {
            if (n < 0)
                return;
            for (int k = 0; k <= n; k++) {
                System.out.print(binom(n, k) + " ");
            }
            System.out.println();
            reversedPascal(n - 1);
        }
    }

    public static void main(String[] args) {
        /*pascal();
        Scanner input = new Scanner(System.in);*/
        int number = 10;
        Scanner in = new Scanner(System.in);


            System.out.println("1. Menu item: Pascal Triangle");
            System.out.println("2. Menu item: Reversed Pascal Triangle");

            System.out.println("0. Quit");

            // handle user commands

            boolean quit = false;

            int menuItem;

            do {
                  System.out.print("Choose menu item: ");
                  menuItem = in.nextInt();
                  switch (menuItem) {
                  case 1:
                        System.out.println("You've chosen item #1  Pascal Triangle\n");
                        pascal();
                        break;
                  case 2:
                        System.out.println("You've chosen item #2  Reversed Pascal Triangle\n");
                        reversedPascal(number);
                        break;
                  case 0:
                        quit = true;
                        break;
                  default:
                        System.out.println("Invalid choice.");
                  }

            } while (!quit);

            System.out.println("Bye-bye!");
            
  }
}
