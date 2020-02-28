public class Main {
    private static final int MAX_BOX_IN_TRUCK = 324;
    private static final int MAX_BOX_IN_CONTAINER = 27;


    public static void main(String[] args) {
        int containerId = 0;
        int cargo = 1;
        int boxCount = 700;
        for (int b = 0; b < boxCount; b++) {
            if (b % MAX_BOX_IN_TRUCK == 0) {
                System.out.printf("Грузовик %d %n", cargo++);
            }
            if (b % MAX_BOX_IN_CONTAINER == 0) {
                System.out.printf(" Контейнер %d %n", containerId++);
            }
            System.out.printf("  . Ящик %d %n", b);
        }
    }
}
