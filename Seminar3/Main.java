package Homework.Seminar3;

import Homework.Seminar3.drugs.Component;
import Homework.Seminar3.drugs.impl.components.Azitronit;
import Homework.Seminar3.drugs.impl.components.Penicillin;
import Homework.Seminar3.drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Component> result = new HashSet<>();
        result.add(new Azitronit("Азитрон", "2", 1));
        result.add(new Water("Вода", "100", 1));
        result.add(new Azitronit("Азитрон", "3", 5));
        result.add(new Water("Вода", "100", 1));
        result.add(new Penicillin("Пенициллин", "100", 1));
        System.out.println("HashSet: ");
        for (Component u : result) {
            System.out.println(u);
        }
        List<Component> componentList = new ArrayList<>(result);

        Collections.sort(componentList);
        System.out.println();
        System.out.println("Отсортированный результат: ");
        for (Component u : componentList) {
            System.out.println(u);
        }

    }
}