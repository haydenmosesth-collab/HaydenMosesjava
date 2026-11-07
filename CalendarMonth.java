package calendarmonth;

import java.util.Scanner;

public class CalendarMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String date = sc.next();
            // Extract the month substring (characters at index 3 and 4)
            String monthStr = date.substring(3, 5);
            int monthIndex = Integer.parseInt(monthStr);
            
            // Array containing month names corresponding to their indices (1-12)
            String[] months = {
                "", "January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"
            };
            
            System.out.print(months[monthIndex]);
        }
        sc.close();
    }
}