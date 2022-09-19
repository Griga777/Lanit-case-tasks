package example;

//Напишите функцию, которая принимает строку из одного или нескольких слов и возвращает ту же строку, но с перевернутыми всеми словами из пяти или более букв.
//Передаваемые строки будут состоять только из букв и пробелов. Пробелы будут включены только в том случае, если присутствует более одного слова.
//Пример: "Это новый тест" -> "Это йывон тест"
public class Task6 {
    public static String returnModifiedString(String s) { // s -> "Это новый тестик"
        int wordLength = 5;
        String[] words = s.split(" "); // words -> {"Это", "новый", "тестик"}
        StringBuilder newStr = new StringBuilder();

        for (String word : words) {
            if (word.length() >= wordLength) {
                String wordReverse = new StringBuilder(word).reverse().toString();
                newStr.append(wordReverse).append(" ");
            } else {
                newStr.append(word).append(" ");
            }
        }
        int lastIndex = newStr.lastIndexOf(" ");
        newStr.deleteCharAt(lastIndex);
        return newStr.toString();
    }
}

