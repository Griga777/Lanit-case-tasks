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

        List<Integer> nearestNumber = new ArrayList<>();
        for (Integer number : numbers) {  // numbers: {8, 22, 12}
            int diff = Math.abs(desiredNumber - number);  // diff = desiredNumber(10) - number(8) = 2
            if (diff <= min) {  // diff(2) <= min(2147483647) true
                min = diff;  // min = 2
                nearestNumber.add(number);
            }
        }
        return Collections.max(nearestNumber);
    }
}
