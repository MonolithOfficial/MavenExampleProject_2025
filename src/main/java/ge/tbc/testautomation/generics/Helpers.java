package ge.tbc.testautomation.generics;

public class Helpers {
    public static <T extends Comparable<T>> T findMax(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return a.compareTo(b) > 0 ? a : b;
    }
}
