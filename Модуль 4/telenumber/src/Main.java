import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите телефон");
        String telephone = scan.nextLine();
        String telephone2 = telephone.replaceAll("[^0-9]", "");

        String phoneNum = telephone2;
        System.out.println(String.valueOf(phoneNum).replaceFirst("(\\d{1})(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "\\+$1 $2 $3-$4-$5"));
    }
}