import java.util.*;

public class gundaya6
{
   public static void main(String [] args){
        int[] arr = {1, 2, 3, 5, 8, 11};
        int sum = 0, count = 0;
 
        for (int x : arr) {
            if (x % 2 != 0) {
                sum += x;
                count++;
            }
        }
 
        double avg = (double) sum / count;
        System.out.println("Average of odd numbers = " + avg);
    }
}
