package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<>();

        words.add("one@gmail.com");
        words.add("saynoto@mail.ru");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду");
            String command = scan.nextLine();
            // я решил посмотреть стандарты в интеренете и поробывал реализовать
            // https://howtodoinjava.com/regex/java-regex-validate-email-address/
            if (command.matches("^ADD\\s[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {
                words.add(command.replaceAll("ADD\\s", ""));
                System.out.println("added");
            }
            else if (command.matches("LIST")) {
                System.out.println(words);
            }
            else if (command.equals("EXIT")) {
                System.out.println("Goodbye");
                break;
            }else {
                System.out.println("Wrong format");
            }
        }
    }
}
