import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

        private static ArrayList<String> todoList = new ArrayList<String>() {{

            add("первое дело");
            add("второе дело");
        }};
        // просто оставил еще один способ
        //вывод списка в консоль
        // Вопрос: правильно ли я использую/декларирую переменную String command?
        String command = "null";
        Scanner scan = new Scanner(System.in);
        // Выполнил задание с бесконечным циклом while для удобности проверки
        while (!command.equals("EXIT")) {
            System.out.println("Введите команду");
            command = scan.nextLine();
            // удаление дела из списка
            if (command.matches("DELETE\\s\\d*")) {
                String index = command.replaceAll("[^0-9]", "");
                if (Integer.parseInt(index) > todoList.size()) {
                    System.out.println("wrong index");
                } else {
                    int result = Integer.parseInt(index);
                    todoList.remove(result);
                }
            }
                // Добавление дела с индексом в список
                Matcher matchAddIndexed = Pattern.compile("^ADD (?<dealNo>\\d+) (?<text>.+)").matcher(command);
                Matcher matchAdd = Pattern.compile("^ADD (?<text>.+)").matcher(command);

                if (matchAddIndexed.matches()) {

                    System.out.println("Команда добавения дела с индексом");
                    String index1 = matchAddIndexed.group("dealNo");
                    String addFunction = matchAddIndexed.group("text");
                    todoList.add(Integer.parseInt(index1), addFunction);

                } else if (matchAdd.matches()) {

                    System.out.println("Команда добавения дела без индекса");
                    String addFunction = matchAdd.group("text");
                    todoList.add(addFunction);

                } else {
                    System.out.println("Invalid");
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
              if (command.matches("EDIT\\s\\d*.*")) {
                String index = command.replaceAll("[^0-9]", "");
                if (Integer.parseInt(index) > todoList.size()) {
                    System.out.println("wrong index");
                } else {
                    String editFunction = command.replaceAll("EDIT\\s\\d*\\s", "");
                    todoList.set(Integer.parseInt(index), editFunction);
                }
                // вывод в консоль списка
            } else if (command.matches("LIST")) {
                printList(todoList);

            }

    }

    private static void printList(ArrayList<String> todoList){
        for (int i = 0; i < Main.todoList.size(); i++) {
            System.out.println(i + " - " + Main.todoList.get(i));
        }
    }

}
