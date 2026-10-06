package labsheet06.question11;

import java.util.Scanner;

class AverageAnalyzer {
    private int[] numbers;

    public AverageAnalyzer(int[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return (double) total / numbers.length;
    }

    public int countAboveAverage() {
        double average = calculateAverage();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        return count;
    }
}

public class Question11AverageNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter 10 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }
        }

        AverageAnalyzer analyzer = new AverageAnalyzer(numbers);
        System.out.println("Average: " + analyzer.calculateAverage());
        System.out.println("Numbers above average: " + analyzer.countAboveAverage());
    }
}