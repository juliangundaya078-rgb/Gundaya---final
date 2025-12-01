
import java.util.*;
public class gundaya1

{
      public static void problem1(Scanner in) {
        int num;
        do {
            System.out.print("Enter a number (1-100): ");
            num = in.nextInt();
        } while (num < 1 || num > 100);
 
        System.out.println("Valid input: " + num);
    }
   }