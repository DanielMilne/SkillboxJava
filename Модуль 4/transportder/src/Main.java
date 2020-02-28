public class Main {


    public static void main(String[] args) {

        int containerId = 0;
        int cargo = 1;
        int boxCount = 700;
        for (int b = 0; b < boxCount; b++) {
            if (b % 324 == 0) {
                System.out.println("грузовик " + cargo++);
            }
            if (b % 27 == 0) {
                System.out.println("Контейнер " + containerId++);
            }
            System.out.println(". Ящик " + b);
        }
    }
}