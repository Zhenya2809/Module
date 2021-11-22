package main.java.com.java.module;

import java.util.ArrayList;
import java.util.List;

public class ModuleTask1 {

    //Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4. *
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 1, 1, 3};

        List<Integer> tmp = new ArrayList<>();

        for (int j : arr) {
            if (!tmp.contains(j)) {
                tmp.add(j);
            }
        }

        System.out.println("к-во различных элементов: "+tmp.size());
    }
}

