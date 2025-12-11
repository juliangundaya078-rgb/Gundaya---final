import java.util.*;
public class gundaya20
{
     public static void main(String [] args) {
        int[] arr = {10, 22, 35, 40, 15, 28};
 
        for (int x : arr)
            if (x % 2 == 0 && x > 20)
                System.out.println(x);
    }
}
