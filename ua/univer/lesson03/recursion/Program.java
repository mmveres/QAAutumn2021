package ua.univer.lesson03.recursion;

public class Program {
    // n! = n * (n-1)!
    public static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {

    }
}
