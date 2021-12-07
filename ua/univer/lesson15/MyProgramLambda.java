package ua.univer.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

//@FunctionalInterface
//interface MyOper{
//    int oper(int x,int y);
//}
public class MyProgramLambda {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> calcSum = (x, y) -> x+y;
        BiFunction<Integer,Integer,Integer> calcMulti = (x, y) -> x*y;
        BiFunction<Integer,Integer,Integer> calcSub = (x, y) -> x-y;

        int result1 = calcSum.apply(2,3);
        System.out.println(result1);
        int result2 = calcMulti.apply(2,3);
        System.out.println(result2);
        int result3 = calcSub.apply(2, 3);
        System.out.println(result3);

        List< BiFunction<Integer,Integer,Integer>> calcOpers = new ArrayList<>();
        calcOpers.add(calcSum);
        calcOpers.add((x, y) -> x/y);
        calcOpers.add((x, y) -> (x+y)/2);

        for (var el: calcOpers) {
            System.out.println(el.apply(10,20));
        }

        calcOpers.forEach(
                el -> System.out.println(el.apply(12,32))
        );
    }
}
