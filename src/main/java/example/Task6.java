package example;

//Напишите функцию, которая принимает строку из одного или нескольких слов и возвращает ту же строку, но с перевернутыми всеми словами из пяти или более букв.
//Передаваемые строки будут состоять только из букв и пробелов. Пробелы будут включены только в том случае, если присутствует более одного слова.
//Пример: "Это новый тест" -> "Это йывон тест"
public class Task6 {
    public static String returnModifiedString(String s) {
        String[] words = new StringBuilder(s).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            newStr.append(words[i]).append(" ");
        }
        return newStr.toString();
    }
}

