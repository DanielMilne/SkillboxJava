
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 300; // ml
        int powderAmount = 5; // g
        int eggsCount = 5; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (milkAmount >= 1000 && sugarAmount >= 10 && powderAmount >= 400 && oilAmount >= 30) {
            System.out.println("Pancakes");
        }
        //milk - 300 ml, powder - 5 g, eggs - 5
        else if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        else if (milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 && appleCount >= 3) {
            System.out.println("Apple pie");
        }
    }
}