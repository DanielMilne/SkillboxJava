import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        // думал, что поможет
        String text2 = text.replaceAll("[^0-9]", " ");
        System.out.println(text2);
        String text4 = text2.trim();
        System.out.println(text4);
        String[] sentences = text4.split("\\s+");
        int sum = 0;
        for (int i = 0; i < sentences.length; i++) {
            sum += Integer.parseInt(sentences[i]);
        }
        System.out.println(sum);

        /* решение через цикл поиска цифр в тексте, мне показался идеальным
        int sizeOfStr = text.length();
        int sum = 0;
        int tempNum = 0;
        for (int i = 0; i < sizeOfStr; ++i) {
            if (Character.isDigit(text.charAt(i))) {
                tempNum = (10 * tempNum) + Character.getNumericValue(text.charAt(i));
                System.out.println(tempNum);
            } else {
                sum += tempNum;
                tempNum = 0;
            }
        }
        sum += tempNum;
        System.out.println(sum);

        long start = System.currentTimeMillis();
        // решение через регулярные выражения
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(text);
        Integer sume = 0;
        while (m.find()) {
            sume += Integer.parseInt(m.group(1));
        }
        System.out.printf("%d\n", sume);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
        */
    }
}