import java.util.*;

public class gundaya15
{
    public static void problem15(Scanner in) {
        int[] arr = new int[5];
 
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
 
        System.out.println("Numbers greater than 50:");
        for (int x : arr)
            if (x > 50)
                System.out.println(x);
    }
} 
