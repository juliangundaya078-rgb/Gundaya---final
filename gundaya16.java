import java.util.*;
public class gundaya16
{
    public static void main(String [] args) {
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int count = 0;
 
        while (num > 0) {
            num /= 10;
            count++;
        }
 
        System.out.println("Digits: " + count);
    }
}
