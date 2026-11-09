package middleterminoddstr;
import java.util.*;

public class MiddleTermInOddStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // Find the middle index of the string
        int mid = s.length() / 2;
        
        // Extract the middle three letters (from mid - 1 to mid + 2)
        String result = s.substring(mid - 1, mid + 2);
        
        System.out.println(result);
    }
}