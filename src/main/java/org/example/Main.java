package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        zliczSamogloski("interfejs Comparator sortuje atrybuty różnych obiektów\n" +
                " interfejsu Comparable używa się kiedy potrzeba nam posortować obiekty w sposób domyślny (natural ordering)");
    }
    public static void zliczSamogloski(String tekst){
        String string = tekst.toUpperCase();
        Map<Character, Integer> map = new LinkedHashMap();
        map.put('A', 0);
        map.put('E', 0);
        map.put('I', 0);
        map.put('O', 0);
        map.put('U', 0);
        for (int i = 0; i <= string.length() - 1; i++) {
            if (map.containsKey(string.charAt(i))) {
                int count = map.get(string.charAt(i));
                map.put(string.charAt(i), ++count);
            }
        }
        System.out.println(map);
    }
}