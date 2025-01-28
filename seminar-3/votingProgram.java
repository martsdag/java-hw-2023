/**
 * @author Skrynnik Valeria
 * created: 2023-11-23 20:01
 */

import java.util.Scanner;

public class VotingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int candidate1Votes = 0;
            int candidate2Votes = 0;

            for (int i = 0; i < 5; i++) {
                System.out.println("Голосование за кандидата:");
                System.out.println("1. Кандидат 1");
                System.out.println("2. Кандидат 2");
                System.out.print("Выберите кандидата (1 или 2): ");

                int choice = scanner.nextInt();

                if (choice == 1) {
                    candidate1Votes++;
                } else if (choice == 2) {
                    candidate2Votes++;
                } else {
                    System.out.println("Некорректный выбор. Голос не учтен.");
                }
            }

            System.out.println("Результаты голосования:");
            System.out.println("Кандидат 1: " + candidate1Votes + " голосов");
            System.out.println("Кандидат 2: " + candidate2Votes + " голосов");
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}