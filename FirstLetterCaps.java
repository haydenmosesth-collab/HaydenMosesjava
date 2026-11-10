package firatlettercaps;
import java.util.*;

public class FirstLetterCaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ' || ch == '\t') {
                sb.append(ch);
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    sb.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                } else {
                    sb.append(ch);
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}