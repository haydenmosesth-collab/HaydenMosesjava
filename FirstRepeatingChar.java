package firstrepeatingchar;

import java.util.Scanner;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                    return;
                }
            }
        }

        sc.close();
    }
}
