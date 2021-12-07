package ua.univer.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ProgamRef {
    public static int sum(int x, int y){
        return x+y;
    }
    public static int multi(int x, int y){
        return x*y;
    }
    public static void main(String[] args) {
        List<BiFunction<Integer,Integer,Integer>> calcCommand = new ArrayList<>();
        calcCommand.add(ProgamRef::sum);
        calcCommand.add(ProgamRef::multi);

        calcCommand.forEach(
                el -> System.out.println(el.apply(2,3))
        );

    }
}
