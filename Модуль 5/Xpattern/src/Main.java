public class Main {

    public static void main(String arg[]) {

        int number = 3;

        for (int i = 1; i <= (number * 2 + 1); i++) {

            for (int j = 1; j <= (number * 2 + 1); j++) {

                if (i == j) {
                    System.out.print("x");

                } else if (i + j == (number * 2 + 2)) {
                    System.out.print("x");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}