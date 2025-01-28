import java.util.Scanner;

public class Fish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите время года (зима, лето, весна, осень):");

        String season = scanner.nextLine();

        if (season.equals("зима")) {
            System.out.println("Зимой можно поймать окуня.");
        } else if (season.equals("лето")) {
            System.out.println("Летом можно поймать ерша.");
        } else if (season.equals("весна")) {
            System.out.println("Весной можно поймать карпа.");
        } else if (season.equals("осень")) {
            System.out.println("Осенью можно поймать карася.");
        } else {
            System.out.println("Неверное время года. Введите зима, лето, весна, осень.");
        }
        scanner.close();
    }
}