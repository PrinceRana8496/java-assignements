package Java8Features2;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateTimeQues6 {
    public static void main(String[] args) {
        compareDates();
        printCurrentTimeInZones();
    }

    private static void compareDates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first date (yyyy-MM-dd):");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter second date (yyyy-MM-dd):");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        if (date1.isBefore(date2)) {
            System.out.println("First date is before second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after second date");
        } else {
            System.out.println("Both dates are equal");
        }
    }

    private static void printCurrentTimeInZones() {
        ZoneId newYork = ZoneId.of("America/New_York");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZoneId london = ZoneId.of("Asia/Kolkata");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current time in New York: " +
                ZonedDateTime.now(newYork).format(formatter));
        System.out.println("Current time in Tokyo: " +
                ZonedDateTime.now(tokyo).format(formatter));
        System.out.println("Current time in Kolkata: " +
                ZonedDateTime.now(london).format(formatter));
    }
}
