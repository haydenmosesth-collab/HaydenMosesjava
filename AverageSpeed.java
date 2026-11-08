package averagespeed;

import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String[] tokens = line.split("\\s+");
            
            double totalDistance = 0.0;
            double totalTime = 0.0;
            
            for (String token : tokens) {
                String[] parts = token.split("@");
                double distance = Double.parseDouble(parts[0]);
                double time = Double.parseDouble(parts[1]);
                
                totalDistance += distance;
                totalTime += time;
            }
            
            double averageSpeed = totalDistance / totalTime;
            System.out.printf("%.2f kmph\n", averageSpeed);
        }
        sc.close();
    }
}