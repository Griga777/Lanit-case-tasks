package example;

import java.util.Arrays;

//Реализуйте метод, определяющий, является ли одна строка перестановкой другой. Под перестановкой понимаем любое изменение порядка символов.
//Регистр учитывается, пробелы являются существенными.
public class Task3 {
    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.equals("") || t.equals("")) {
            throw new TasksException("Строки не должны быть пустыми");
        }
        if (s.equals(t)) {
            throw new TasksException("Строки не должны быть одинаковыми");
        }
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
