import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.DateFormat;

public class Main {

    public static void main(String[] args) {

        int x = 1992;
        int y = 0;
        while ( x< 2020)
        {
            Calendar calendar = Calendar.getInstance();
            Date date = new Date();
            calendar.set(x, 0, 5);
            SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy - E");
            System.out.println(y + " - " + format1.format(calendar.getTime()));
            x++;
            y++;
        }
    }
    }


