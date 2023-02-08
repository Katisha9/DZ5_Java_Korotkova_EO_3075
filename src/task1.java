// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        HashMap<Object, Object> phoneBookMap = new HashMap<>();
        phoneBookMap.put("(495)1234567", "Александров");
        phoneBookMap.put("(495)2345678", "Владимиров");
        phoneBookMap.put("(495)3456789", "Александров");
        phoneBookMap.put("(495)4567890", "Боринов");
        phoneBookMap.put("(495)5678901", "Александров");
        phoneBookMap.put("(495)6789012", "Владимиров");
        phoneBookMap.put("(495)7890123", "Боринов");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию для поиска в базе");
        Object name;
        name = scanner.next();

        for(HashMap.Entry<Object, Object> phoneMapEntry : phoneBookMap.entrySet()) {
            if (phoneMapEntry.getValue().equals(name)) {
                System.out.println(phoneMapEntry.getKey());
            }
        }
        }
    }



