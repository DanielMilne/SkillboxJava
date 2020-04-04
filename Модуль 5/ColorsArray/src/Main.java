public class Main {

    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");

        int len = colors.length;

        for (int i = 0; i < len / 2; i++) {
            String temp = colors[len - i - 1];
            colors[len - i - 1] = colors[i];
            colors[i] = temp;

        }
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i] + " " + i + " ");
        }
    }
}
