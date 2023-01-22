import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear = sc.nextInt();
        int zodiac = birthYear % 12;
        String[] zodiacData = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha",
                "Yılan", "At", "Koyun"};
        System.out.println("Your zodiac is: " + zodiacData[zodiac]);

    }
}