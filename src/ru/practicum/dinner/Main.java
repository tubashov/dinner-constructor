package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;
    static Random cd;
    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);
        cd = new Random();

        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Введите тип блюда:");
                    String dishType = scanner.nextLine();
                    System.out.println("Введите название блюда:");
                    String dishName = scanner.nextLine();
                    if (dc.checkType(dishType)) {
                        dc.addNewDish(dishType, dishName);
                    } else {
                        dc.addNewType(dishType);
                        dc.addNewDish(dishType, dishName);
                    }
                    break;
                case "2":
                    generateDishCombo();
                    break;
                case "3":
                    return;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }


    private static void generateDishCombo() {
        System.out.println("Начинаем конструировать обед...");

        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
        String nextItem = scanner.nextLine();


        //реализуйте ввод типов блюд
        while (!nextItem.isEmpty()) {
            if (!dc.checkType(nextItem)) {
                System.out.println("Такого типа нет");
                break;
            } else {
                ArrayList<String> dishesCombo = new ArrayList<>();
                int bound = dc.dishes.get(nextItem).size();
                int chooseId = cd.nextInt(bound); // в метод nextInt нужно передавать переменнуую верхней границы ArrayList с объявленным типом
                dishesCombo.add(dc.dishes.get(nextItem).get(chooseId));

                //dc.dishes.get(nextItem);
                // создать ArrayList или хэштаблицу, где ключ будет тип блюда nextItem, а значение будет
            }
        }

        // сгенерируйте комбинации блюд и выведите на экран
        // а значение будет рандомно выбранное блюда из таблицы dishes
    }
}
