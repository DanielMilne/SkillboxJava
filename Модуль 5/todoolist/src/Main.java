import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static ArrayList<String> todoList = new ArrayList<String>(1000) {{
        add("первое дело");
        add("второе дело");
    }};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду");

            String command = scan.nextLine();
            Matcher matchAdd = Pattern.compile("^ADD (?<text>.+)").matcher(command);
            Matcher matchAddIndexed = Pattern.compile("^ADD (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchDELETEIndexed = Pattern.compile("^DELETE (?<dealNo>\\d+)").matcher(command);
            Matcher matchEDITIndexed = Pattern.compile("^EDIT (?<dealNo>\\d+) (?<text>.+)").matcher(command);

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

    private static void printList(ArrayList<String> args) {
        for (int i = 0; i < Main.todoList.size(); i++) {
            System.out.println(i + " - " + Main.todoList.get(i));
        }
    }

    public static int parseIndex(Matcher a) {
        int indexCheck = Integer.parseInt(a.group("dealNo"));
        if (indexCheck > Main.todoList.size()) {
            System.out.println("неверный индекс");
            indexCheck = -1;
        }
        return indexCheck;
    }
}


//            } else if (command.matches("ADD\\s\\d*\\s.*")) {
//                String index = command.replaceAll("[^0-9]", "");
//                String addFunction = command.replaceAll("ADD\\s\\d*\\s", "");
//                todoList.add(Integer.parseInt(index), addFunction);
//               //  добавление дела
//            } else if (command.matches("ADD\\s\\w*")) {
//                String addFunctionIndex = command.replaceAll("ADD\\s", "");
//                todoList.add(addFunctionIndex);
//   изменение дела
//            if (command.matches("EDIT\\s\\d*.*")) {
//                String index = command.replaceAll("[^0-9]", "");
//                if (Integer.parseInt(index) > todoList.size()) {
//                    System.out.println("wrong index");
//                } else {
//                    String editFunction = command.replaceAll("EDIT\\s\\d*\\s", "");
//                    todoList.set(Integer.parseInt(index), editFunction);
//                }
//                // вывод в консоль списка


// удаление дела из списка
//            if (command.matches("DELETE\\s\\d*")) {
//                String index = command.replaceAll("[^0-9]", "");
//                if (Integer.parseInt(index) > todoList.size()) {
//                    System.out.println("wrong index");
//                } else {
//                    int result = Integer.parseInt(index);
//                    todoList.remove(result);
//                }
//            }


//                }
//                String index1 = matchAddIndexed.group("dealNo");
//                String addFunction = matchAddIndexed.group("text");
//                todoList.add(Integer.parseInt(index1), addFunction);
