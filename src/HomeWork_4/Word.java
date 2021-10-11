package HomeWork_4;

import java.util.HashMap;


public class Word {
    public static void main(String[] args) {
        String[] strings = {"Утро", "День", "День", "Вечер", "Ночь", "Рассвет", "Сумерки", "Сумерки", "Закат", "Полночь"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String string : strings) {
            int n = hashMap.getOrDefault(string, 0);
            hashMap.put(string, ++n);
        }
        System.out.println("Уникальные слова - " + hashMap);
    }
}
