public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);

        String Vasja = text.substring(15, 19);   // выделяю из текста число
        int num = Integer.parseInt(Vasja);      // перевожу в int
        String Petr = text.substring(35, 39);   // выделяю из текста число
        int num1 = Integer.parseInt(Petr);      // перевожу в int
        String Masha = text.substring(56, 61); // выделяю из текста число
        int num2 = Integer.parseInt(Masha);    // перевожу в int
        Integer summ = num + num1 + num2;      // создаю переменную с вычислением общей суммы
        System.out.println("В сумме - " + summ);   // вывожу в консоль

        // цикл вывода всего алфавита с кодами
        for (char i = 'a'; i <= 'z'; i++) {
            char b = i;
            int code = (int) i;
            System.out.println(b + "=" + code);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            char b = i;
            int code = (int) i;
            System.out.println(b + "=" + code);
        }
    }
}
