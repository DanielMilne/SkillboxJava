public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(1233));
    }

    public static Integer sumDigits(Integer number) {
        String strip = Integer.toString(number);                  //переводит int в string для использования length() и charAt()

        int sum = 0;                                              //переменная sum приравнивается к нулю
        for (int i = 0; i < strip.length(); i++)                    //считает длинну number и на основании запускает цикл
        {
            sum += Character.getNumericValue(strip.charAt(i));    //к sum прибавляется каждая цифра через цикл
        }
        return sum;
    }

}
