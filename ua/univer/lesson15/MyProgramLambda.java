package ua.univer.lesson15;

import java.util.ArrayList;
import java.util.List;

interface MyOper{
    int oper(int x,int y);
}
public class MyProgramLambda {

    public static void main(String[] args) {
        MyOper calcSum = (x, y) -> x+y;
        MyOper calcMulti = (x, y) -> x*y;
        MyOper calcSub = (x, y) -> x-y;

        int result1 = calcSum.oper(2,3);
        System.out.println(result1);
        int result2 = calcMulti.oper(2,3);
        System.out.println(result2);
        int result3 = calcSub.oper(2, 3);
        System.out.println(result3);

        List<MyOper> calcOpers = new ArrayList<>();
        calcOpers.add(calcSum);
        calcOpers.add((x, y) -> x/y);
        calcOpers.add((x, y) -> (x+y)/2);

        for (var el: calcOpers) {
            System.out.println(el.oper(10,20));
        }
    }
}
