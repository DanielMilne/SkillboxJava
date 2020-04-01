import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        int listCount = 0;
        boolean after;
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1992, 6, 5);
        while (after = birthday.isBefore(now)) {
            //        LocalDate Birthday = LocalDate.of(1992, 6, 5);
            //     LocalDate Birthday1 = LocalDate.of(1992, 6, 5);
            LocalDate minusYears = birthday.plusYears(1); // 2020-01-21T09:11:48.486298  // понял как это работет
            System.out.println(birthday.format(DateTimeFormatter.ofPattern(listCount + " - " + "dd.MM.yyyy - E")));
            listCount++;
            birthday = minusYears;
        }
    }


}


/*


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        int listCount = 0;
        int yearOfBirth = 1992;
        while (yearOfBirth < 2021) {
            LocalDate startYear = LocalDate.of(yearOfBirth, 06, 05); // 2018-01-21T09:11:48.486298
            // LocalDate minusYears = now.plusYears(1); // 2020-01-21T09:11:48.486298  // понял как это работет
            System.out.println(startYear.format(DateTimeFormatter.ofPattern(listCount + " - " + "dd.MM.yyyy - E")));
            listCount++;
            yearOfBirth++;

        }
    }
}



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.DateFormat;

public class Main {

    public static void main(String[] args) {

        int x = 1992;
        int y = 0;
        while ( x< 2021)
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
*\



