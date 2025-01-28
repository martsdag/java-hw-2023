import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFinder {
    public static void main(String[] args) {
        String textWithDates = "Встреча запланирована на 2023-12-17 и 2025-01-05.";
        String datePattern = "\\d{4}-\\d{2}-\\d{2}";

        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(textWithDates);

        System.out.println("Найденные даты:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}