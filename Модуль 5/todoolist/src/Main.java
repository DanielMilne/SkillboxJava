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
        // Выполнил задание с бесконечным циклом while для удобности проверки
        while (true) {
            System.out.println("Введите команду");

            String command = scan.nextLine();
            Matcher matchAdd = Pattern.compile("^ADD (?<text>.+)").matcher(command);
            Matcher matchAddIndexed = Pattern.compile("^ADD (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchDELETEIndexed = Pattern.compile("^DELETE (?<dealNo1>\\d+)").matcher(command);
            Matcher matchEDITIndexed = Pattern.compile("^EDIT (?<dealNo1>\\d+) (?<text>.+)").matcher(command);

            if (matchAddIndexed.matches()) {
                System.out.println("Команда добавения дела с индексом");
                String index1 = matchAddIndexed.group("dealNo");
                String addFunction = matchAddIndexed.group("text");
                todoList.add(Integer.parseInt(index1), addFunction);
            } else if (matchAdd.matches()) {
                System.out.println("Команда добавения дела без индекса");
                String addFunction = matchAdd.group("text");
                todoList.add(addFunction);
            } else if (matchDELETEIndexed.matches()) {
                System.out.println("Команда удаления дела с индексом");
                String index = matchDELETEIndexed.group("dealNo1");
                todoList.remove(Integer.parseInt(index));
            } else if (matchEDITIndexed.matches()) {
                System.out.println("Команда правки дела");
                String index = matchEDITIndexed.group("dealNo1");
                String editFunction = matchEDITIndexed.group("text");
                todoList.set(Integer.parseInt(index), editFunction);
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
        for (int i = 0; i < Main.todoList.size(); i++) {
            System.out.println(i + " - " + Main.todoList.get(i));
        }
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
