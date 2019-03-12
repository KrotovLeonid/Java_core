package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String[] str = new String[]{"Ночь", "Утро", "День", "Вечер", "Ночь",
                                    "Утро", "День", "Вечер", "Ночь", "Утро", "День", "Вечер", "Ночь"};
        HashSet<String> hashSet  = new HashSet<>();

        for (String s : str) hashSet.add(s);

        System.out.println(hashSet);

        for (String h : hashSet){
            int count = 0;
            for(String s: str) if (h.equals(s)) count++;
            System.out.println(h + " Встерчается " + count + " раза.");
	    }

    }
}
