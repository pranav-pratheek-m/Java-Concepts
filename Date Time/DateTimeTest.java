
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");

        LocalDate birth_date = null;

        try {

            birth_date = LocalDate.parse(args[0], format);

        } catch (DateTimeException ex) {
            System.out.println("Date exception occurred.");
        }

        System.out.println("You were born on " + birth_date);
        System.out.println("The day was " + birth_date.getDayOfWeek());

        Period age = Period.between(birth_date, LocalDate.now());

        System.out.print("Your age is now ");
        System.out.print(age.getYears() + " years,");
        System.out.print(age.getMonths() + " months,");
        System.out.println(age.getDays() + " days ");

        long no_of_days = birth_date.until(LocalDate.now(), ChronoUnit.DAYS);

        System.out.println(no_of_days + " days have passed since you were born!");

        System.out.println("You will reach 30,000 days on " + birth_date.plusDays(30_000));

        LocalDate y2k = LocalDate.of(2_000, 1, 1);

        System.out.println("This millenium started on " + y2k);

        Period time_since_y2k = Period.between(y2k, LocalDate.now());

        System.out.println("Time since  since Y2K bug occurred " + time_since_y2k);

        long days_since_y2k = y2k.until(LocalDate.now(), ChronoUnit.DAYS);

        System.out.println(days_since_y2k + " days have passed since y2k");

    }
}