package Lesson3;

import java.util.HashMap;

public class Phonebook {
    String name = "";
    String phonenumber = "";

    Phonebook(String name, String phonenumber){
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public HashMap<String, String > hmPhonebook = new HashMap<>();
        hmPhonebook.put("Вася", "+7 916 000 00 01");
        hmPhonebook.put("Петя", "+7 916 000 00 02");
        hmPhonebook.put("Маша", "+7 916 000 00 03");
        hmPhonebook.put("Коля", "+7 916 000 00 04");
        hmPhonebook.put("Иван", "+7 916 000 00 05");
        hmPhonebook.put("Иван", "+7 916 000 00 06");
        hmPhonebook.put("Вася", "+7 916 000 00 07");
        hmPhonebook.put("Дима", "+7 916 000 00 08");
        hmPhonebook.put("Оля", "+7 916 000 00 09");
        hmPhonebook.put("Шухрат", "+7 916 000 00 10");

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setHmPhonebook(HashMap<String, Phonebook> hmPhonebook) {
        this.hmPhonebook = hmPhonebook;
    }

}
