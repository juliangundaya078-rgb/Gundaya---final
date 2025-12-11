import java.util.*;

public class gundaya5
{
    public static void main(String [] args){
        int[] arr = {2, 4, 9, 7, 1, 10};
        int find = 7;
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}
