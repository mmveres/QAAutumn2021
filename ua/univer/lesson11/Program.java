package ua.univer.lesson11;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kyiv");
        map.put(1, "Lviv");
        map.put(16, "Odessa");
        map.put(15, "Poltava");
        map.put(20, "Kaniv");
        map.put(32, "Zhashkiv");

        System.out.println(map);

        System.out.println(map.get(32));


        List<Integer> arr =  Arrays.asList(1,1,1,1,4,1,2,3,4,5,6,6);
        System.out.println(arr);
        Set<Integer> set = new HashSet<>(arr);
        System.out.println(set);
    }
}
