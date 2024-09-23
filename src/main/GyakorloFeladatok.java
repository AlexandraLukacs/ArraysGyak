package main;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GyakorloFeladatok {
    
    private static final Random rnd = new Random();
    
    private static ArrayList<Integer>szamok;

    public static void main(String[] args) {
        szamok = new ArrayList<>();
        feltolt();
        kiirLista("Páros és páratlan: ");
        prtlTorol();
        melyikbolMennyi();
        kiirMap();
    }

    private static void feltolt() {
        for (int i = 0; i < 20; i++) {
            int v = (int)(Math.random()*11)+10;
            szamok.add(v);
        }
        System.out.println("Páros és páratlan: " + szamok);
        
        
    }
    
    private static void kiirLista() {
        
    }

    private static void prtlTorol() {
        
    }

    private static void melyikbolMennyi() {
        HashMap<Integer, Integer> statisztika = new HashMap<>();
        for (int szam: szamok) {
            int kulcs = szam;
            if(statisztika.containsKey(kulcs)){
                // a meglévő értéket növeljük
                int ertek = statisztika.get(kulcs);
                statisztika.put(kulcs, ertek++);
            }else{
                // létrehozzuk a kulcsot 1 értékkel
                statisztika.put(kulcs, 1);
            }
        }
    }

    private static void kiirMap() {
        for(Map.Entry<Integer, Integer> entry: statisztika.entrySet()){
            int kulcs = entry.getKey();
            int ertek = entry.getValue();
        }
    }
}
