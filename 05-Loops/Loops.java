/*
========================================
JAVA LOOPS 
Purpose: Learning and demonstrating loops in Java
Topics covered:
1. for loop
2. while loop
3. do-while loop
4. break
5. continue
6. nested loops
7. user input with loops
========================================
*/

import java.util.Scanner;

public class Loops{

    public static void main(String[] args) {

        /*
         ========================================
         1) FOR LOOP
         Used when number of iterations is known
         ========================================
         */

        System.out.println("FOR LOOP (1 to 5)");

        // initialization ; condition ; update
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");


        /*
         ========================================
         2) WHILE LOOP
         Used when iterations are unknown
         Condition checked BEFORE execution
         ========================================
         */

        System.out.println("WHILE LOOP (1 to 5)");

        int j = 1; // initialization

        while (j <= 5) {  // condition
            System.out.print(j + " ");
            j++; // update 
        }

        System.out.println("\n");


        /*
         ========================================
         3) DO-WHILE LOOP
         Executes AT LEAST ONCE
         Condition checked AFTER execution
         ========================================
         */

        System.out.println("DO-WHILE LOOP (1 to 5)");

        int k = 1;

        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);

        System.out.println("\n");


        /*
         ========================================
         4) BREAK STATEMENT
         Stops loop immediately
         ========================================
         */

        System.out.println("BREAK EXAMPLE (stop at 3)");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                break; // exit loop when i becomes 3
            }

            System.out.print(i + " ");
        }

        System.out.println("\n");


        /*
         ========================================
         5) CONTINUE STATEMENT
         Skips current iteration only
         ========================================
         */

        System.out.println("CONTINUE EXAMPLE (skip 3)");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue; // skip number 3
            }

            System.out.print(i + " ");
        }

        System.out.println("\n");


        /*
         ========================================
         6) NESTED LOOPS
         Loop inside another loop
         Used for patterns, matrices, grids
         ========================================
         */

        System.out.println("NESTED LOOP (star pattern)");

        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }

            System.out.println(); // move to next line
        }


        /*
         ========================================
         7) USER INPUT + LOOP
         Practical example
         ========================================
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a number to print table:");

        int n = sc.nextInt();

        // multiplication table using loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();


        /*
         ========================================
         KEY TAKEAWAYS
         ----------------------------------------
         for      -> fixed iterations
         while    -> unknown iterations
         do-while -> runs at least once
         break    -> stop loop
         continue -> skip iteration
         nested   -> patterns / 2D problems
         ========================================
         */
    }
}