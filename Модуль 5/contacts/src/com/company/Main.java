package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> good2count = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите команду");
            String goodName = scanner.nextLine();
            //проверяет вписано имя или телефон
            Matcher matchName = Pattern.compile("\\w+").matcher(goodName);
            // печать всего списка
            if (goodName.equals("LIST")) {
                printMap(good2count);
                continue;
            }
            // первым проверяю через matchName введено имя или телефон
            if (good2count.containsKey(goodName) == false && matchName.matches()) {
                System.out.println("Имя в базе не найденно. Введите телефон для сохранения");
                //если имя не найдено, то цикл ввода телефона с проверкой на верность формата через numberCheck()
                for (; ; ) {
                    String phoneNumber = scanner.nextLine();
                    if (numberCheck(phoneNumber) == true) {
                        good2count.put(goodName, phoneNumber);
                        System.out.println("Контакт сохранен");
                        break;
                    } else if (numberCheck(phoneNumber) == false) {
                        System.out.println("Неверный формат номера, введите еще раз");
                    }
                }
                //если введены цифры а не буквы, то работает цикл сохарнение контаката
            } else if (good2count.values().contains(goodName) == false && numberCheck(goodName)) {
                System.out.println("Телефон в базе не найден, для сохранения введите имя");
                String name = scanner.nextLine();
                good2count.put(name, goodName);
                System.out.println("Контакт сохранен");
                // в зависимости от введения имени или телефона распечатывает информацию
            } else if (good2count.values().contains(goodName)) {
                Set<String> s = good2count.keySet();
                String t = good2count.get(s);
                System.out.println(s + "" + t);
            } else if (good2count.containsKey(goodName)) {
                String key = good2count.get(goodName);
                System.out.println(key);
            }
        }

    }

    //метод проверяет правильность формата телефона
    public static boolean numberCheck(String a) {
        Matcher matchPhone = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$").matcher(a);
        if (matchPhone.matches() == false) {
            return false;
        } else {
            return true;
        }
    }

    //метод распечатывает value и key
    private static void printMap(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
    }
}