import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert {
    public static String convertDateToString(Date date) {
        // Create a SimpleDateFormat instance with the desired format
        SimpleDateFormat formatter = new SimpleDateFormat("dd\\MM\\yyyy");
        // Format the date as a string
        return formatter.format(date);
    }

    public static void main(String[] args) {
        // Example usage
        Date date = new Date(); // Use the current date
        String formattedDate = convertDateToString(date);
        System.out.println(formattedDate);
    }
}
