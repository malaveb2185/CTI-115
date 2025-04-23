import java.util.Scanner;

public class Malave_M5CW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];
        int i = 0;

        do {
            System.out.print("Enter score " + (i + 1) + " (0-100): ");
            int input = scanner.nextInt();

    
            while (input < 0 || input > 100) {
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                input = scanner.nextInt();
            }

            scores[i] = input;
            i++;
        } while (i < 5);

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        int average = total / 5;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The student's average score is: " + average);
        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }
}