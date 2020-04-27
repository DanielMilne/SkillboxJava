import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static ArrayList<String> todoList = new ArrayList<String>() {{
        add("первое дело");
        add("второе дело");
    }};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду");

            String command = scan.nextLine();
            Matcher matchAdd = Pattern.compile("ADD (?<text>.+)").matcher(command);
            Matcher matchAddIndexed = Pattern.compile("ADD (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchDELETEIndexed = Pattern.compile("DELETE (?<dealNo>\\d+)").matcher(command);
            Matcher matchEDITIndexed = Pattern.compile("EDIT (?<dealNo>\\d+) (?<text>.+)").matcher(command);

            if (matchAddIndexed.matches()) {
                System.out.println("Команда добавения дела с индексом");
                int index = parseIndex(matchAddIndexed);
                if (index >= 0) {
                    todoList.add(index, matchAddIndexed.group("text"));
                }
            } else if (matchAdd.matches()) {
                System.out.println("Команда добавения дела без индекса");
                String addFunction = matchAdd.group("text");
                todoList.add(addFunction);
            } else if (matchDELETEIndexed.matches()) {
                System.out.println("Команда удаления дела с индексом");
                int index = parseIndex(matchDELETEIndexed);
                if (index >= 0) {
                    todoList.remove(index);
                }
            } else if (matchEDITIndexed.matches()) {
                System.out.println("Команда правки дела");
                int index = parseIndex(matchEDITIndexed);
                if (index >= 0) {
                    todoList.add(index, matchEDITIndexed.group("text"));
                }
            } else if (command.matches("LIST")) {
                printList(todoList);
            } else if (command.equals("EXIT")) {
                break;
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static void printList(ArrayList<String> todoList) {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
    }

    public static int parseIndex(Matcher a) {
        int indexCheck = Integer.parseInt(a.group("dealNo"));
        if (indexCheck > todoList.size()) {
            System.out.println("неверный индекс");
            indexCheck = -1;
        }
        return indexCheck;
    }
}
