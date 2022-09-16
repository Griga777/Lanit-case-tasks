package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Реализовать функцию, которая для данного массива целых чисел(Integer) возвращает число наиболее близкое к 10,
//если таких чисел два(н-р 8,12) то возвращать больше из них
public class Task5 {
    public static int returnNearestNumber(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int desiredNumber = 10;
        List<Integer> nearestNumber = null;

        for (int number : numbers) {
            int diff = Math.abs(desiredNumber - number);
            if (diff <= min) {
                min = diff;
            }
            nearestNumber = new ArrayList<>();
            nearestNumber.add(number);
        }
        return Collections.max(nearestNumber);
    }
}
