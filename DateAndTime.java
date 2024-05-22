import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Date d = new Date(2);
        // System.out.println(d);

        Date date1 = new Date(1);
        System.out.println(date1);
    }
}
