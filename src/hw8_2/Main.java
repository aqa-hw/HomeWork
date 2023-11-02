package hw8_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current time");
        int currentTime = scanner.nextInt();

        if (currentTime >= 7 && currentTime <= 11) {
            System.out.println(Enum.Time.BREAKFAST.getMessage());
        } else if (currentTime >= 12 && currentTime <= 15) {
            System.out.println(Enum.Time.LUNCH.getMessage());
        } else if (currentTime >= 18 && currentTime <= 22) {
            System.out.println(Enum.Time.DINNER.getMessage());
        } else {
            System.out.println("Not a Food-time xD");
        }
    }
}

