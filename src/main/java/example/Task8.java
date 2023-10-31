package example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task8 {
    public static String removeDuplicateSymbols(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        return list.stream()
                .distinct()
                .collect(Collectors.joining());
//        return new LinkedList<>(Arrays.asList(s.split(""))).stream()
//                .distinct()
//                .collect(Collectors.joining());

    }
}
