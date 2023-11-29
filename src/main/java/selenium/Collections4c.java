package selenium;

import java.util.HashMap;
import java.util.Map;

public class Collections4c {

static Map<Integer, String> slownik = new HashMap<>();
    public static void main(String[] args){
        slownik.put(1, "Ala");
        slownik.put(2, "Ma");
        slownik.put(3, "Kota");

        for (int i = 1; i <= slownik.size() ; i++) {
            System.out.println("Element slownika: " + slownik.get(i));
        }

        slownik.put(1, "Adam");
        slownik.put(4, "As to kot Ali");
        slownik.put(5, "Koty są głodne, trzeba nakarmić");

        for (int i = 1; i <= slownik.size() ; i++) {
            System.out.println("Element slownika: " + slownik.get(i));
        }

    }
}

