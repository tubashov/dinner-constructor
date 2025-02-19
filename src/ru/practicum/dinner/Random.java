package ru.practicum.dinner;
public class Random {


    public int nextInt(int bound) {
        int chooseId =   nextInt(bound - 1);
        //new java.util.Random().nextInt(bound);

        return chooseId;
    }
}
