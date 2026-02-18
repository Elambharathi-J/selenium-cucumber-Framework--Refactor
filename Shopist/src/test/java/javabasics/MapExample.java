package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(210854,"Elambharathi j");
        m.put(210896,"GokulKrishnan j");
        System.out.println(m);
        m.put(210744,"SanjayKumar");
        System.out.println(m);

        for (Map.Entry k:m.entrySet()){
            System.out.println(k);
            System.out.println(k.getKey());
        }

        System.out.println(m.get(210854));
    }
}
