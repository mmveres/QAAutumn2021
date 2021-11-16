package ua.univer.lesson09;

public class Inspector {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args) {
        Inspector gm = new Inspector();
        gm.<String>f("");
     //   gm.<Integer>f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
