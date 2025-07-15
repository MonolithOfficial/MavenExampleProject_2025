package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.abstractClassesAndInterfaces.Rectangle;
import ge.tbc.testautomation.inheritanceAndPolymorphism.Square;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("10");
        hashSet.add("2");
        hashSet.add("something");
        hashSet.add(new Rectangle(10, 10));

        Iterator iter = hashSet.iterator();
        while (iter.hasNext()) {
            Object currentItem = iter.next();
            if (currentItem instanceof String) {
                String str = (String) currentItem;
                System.out.println(str);
            }
        }

        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("10");
        hashSet2.add("2");
        hashSet2.add("something");

        Iterator<String> iter2 = hashSet2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter2.next());
        }

        Map<String, Rectangle> map = new HashMap<>();
        map.put("Rectangle1", new Rectangle(10, 10));
        map.put("15", new Rectangle(10, 10));

        Tuple<String, List<Rectangle>> tuple1 = new Tuple<>();
        Tuple<Integer, String> tuple2 = new Tuple<>();
        tuple1.setElementOne("Anzor Areshidze");
//        tuple1.setElementTwo(10010010);


        Rectangle biggerRect =
                Helpers.findMax(new Rectangle(10, 10), new Rectangle(20, 20));
    }
}
