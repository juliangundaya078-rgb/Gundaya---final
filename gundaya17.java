import java.util.*;

public class gundaya17
{
      public static void main(String [] args){
        int[] arr = {5, 9, 1, 7, 6};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
 
        for (int x : arr) {
            if (x > highest) {
                second = highest;
                highest = x;
            } else if (x > second && x != highest) {
                second = x;
            }
        }
 
        System.out.println("Second highest = " + second);
    }
}
