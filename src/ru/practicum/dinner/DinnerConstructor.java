package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> dishes;
    DinnerConstructor() { dishes = new HashMap<>();}

    boolean checkType(String type) {
        boolean chek = dishes.containsKey(type);
        return chek;
    }
    void addNewType(String dishType) {
        // добавьте новое блюдо
        dishes.put(dishType, new ArrayList<>());
    }
    void addNewDish(String dishType, String dishName) {
        // добавьте новое блюдо
         dishes.get(dishType).add(dishName);
         return;
    }
}
