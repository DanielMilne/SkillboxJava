import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        
          Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String fio = scan.nextLine();

        String[] fio2 = fio.split("\\b\\s", 3);
        System.out.println("Фамилиия: " + fio2[0]);
        if (fio2.length > 1) {
            System.out.println("Имя: " + fio2[1]);
        }
        if (fio2.length > 2)
            System.out.println("Отчество: " + fio2[2]);

       
   /*     
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String fio = scan.nextLine();


        if (fio.trim().length() > 0) {
            int length = fio.trim().length();
            if (fio.trim().indexOf(' ') == -1) {
                System.out.println("Фамилия = " + fio);

            } else if (fio.trim().indexOf(' ') > 0) {
                int space = fio.trim().indexOf(' ');
                String familia = fio.trim().substring(0, space);
                System.out.println("Фамилия = " + familia);
            }

            if (fio.trim().indexOf(' ') > -1) {
                int space = fio.trim().indexOf(' ');
                int space2 = fio.trim().lastIndexOf(' ');
                if (fio.trim().indexOf(' ', space + 1) > -1) {
                    String name = fio.trim().substring(space, space2);
                    System.out.println("Имя = " + name);
                } else {
                    String name2 = fio.trim().substring(space, length);
                    System.out.println("Имя = " + name2);
                }


                if (space != space2) {
                    int lastchr = fio.trim().length();
                    String otchesvo = fio.trim().substring(space2, lastchr);
                    System.out.println("Отчество = " + otchesvo);
                }
            }
        } else {
            System.out.println("пусто");

        }
        */

    }

}

