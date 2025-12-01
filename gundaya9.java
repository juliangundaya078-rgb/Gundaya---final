import java.util.*;

public class gundaya9
{
      public static void problem9(Scanner in) {
        int sum = 0, num;
 
        while (true) {
            System.out.print("Enter number (0 to stop): ");
            num = in.nextInt();
            if (num == 0) break;
            sum += num;
        }
 
        System.out.println("Sum = " + sum);
    }
}