package com.ua.robotdreams.homework19;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Введіть слово для перекладу: ");
        String sourceWord = myObj.nextLine();

        Map<String, List<String>> dict = new HashMap<>();
        dict.put("собака", List.of("dog", "犬", "der Hund"));
        dict.put("кіт", List.of("cat", "猫", "die Katze"));
        dict.put("дитина", List.of("child", "子供", "das Kind"));
        dict.put("кавун", List.of("watermelon", "スイカ", "die Wassermelone"));
        dict.put("автомобіль", List.of("car", "自動車", "das Auto"));
        dict.put("кава", List.of("coffee", "コーヒー", "der Kaffee"));
        dict.put("хліб", List.of("bread", "パン", "das Brot"));
        dict.put("книга", List.of("book", "本", "das Buch"));
        dict.put("кімната", List.of("room", "部屋", "das Zimmer"));
        dict.put("килим", List.of("carpet", "カーペット", "der Teppich"));

        System.out.println("Переклад слова " + sourceWord + " на англійську, японську та німецьку мови: " + dict.get(sourceWord.toLowerCase()));

    }
}