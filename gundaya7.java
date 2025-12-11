import java.util.*;

public class gundaya7
{
    public static void main(String [] args) {
        int[] arr = {-5, 3, -2, 8, -9};
 
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                arr[i] = -arr[i];
 
        System.out.println(Arrays.toString(arr));
    }
    }
