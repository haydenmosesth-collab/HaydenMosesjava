package firstrepeatingcharfromlast;
import java.util.*;

public class FirstRepeatingCharFromLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Use nextLine() to capture strings with spaces
        
        char result = ' ';
        
        // Iterate from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            // If the first occurrence of 'ch' is before 'i', 
            // it means this character has appeared previously towards the right.
            if (s.indexOf(ch) < i) {
                result = ch;
                break;
            }
        }
        
        System.out.println(result);
    }
}