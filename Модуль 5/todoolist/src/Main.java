import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<String>() {{
            add("первое дело");
            add("второе дело");
        }};
        // просто оставил еще один способ
        todoList.add("третье дело");

        //вывод списка в консоль
        printList(todoList);
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
                // Добавление дела с индексом в список
            } else if (command.matches("ADD\\s\\d*\\s.*")) {
                String index = command.replaceAll("[^0-9]", "");
                String addFunction = command.replaceAll("ADD\\s\\d*\\s", "");
                todoList.add(Integer.parseInt(index), addFunction);
                // добавление дела
            } else if (command.matches("ADD\\s\\w*")) {
                String addFunctionIndex = command.replaceAll("ADD\\s", "");
                todoList.add(addFunctionIndex);
                // изменение дела
            } else if (command.matches("EDIT\\s\\d*.*")) {
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
    }

    private static void printList(ArrayList<String> todoList) {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
    }

}
