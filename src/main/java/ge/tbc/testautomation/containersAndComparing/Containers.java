package ge.tbc.testautomation.containersAndComparing;

import ge.tbc.testautomation.abstractClassesAndInterfaces.Rectangle;
import ge.tbc.testautomation.inheritanceAndPolymorphism.Square;

import java.util.*;

public class Containers {
    public static void main(String[] args) {
//        Rectangle[] rectangles = new Rectangle[]{new Rectangle(10, 10),
//        new Rectangle(20, 20)};
        Rectangle[] rectangles = new Rectangle[2];
        Collection collection = new ArrayList();

        collection.add(10);
        System.out.println(collection.size());
        collection.add(10);
        System.out.println(collection.size());
        collection.add(10);
        System.out.println(collection.size());
        collection.add(10);
        System.out.println(collection.size());
        collection.remove(10);
        System.out.println(collection.size());

        Collection collection2 = new ArrayList(){
            {
                add(10);
                add(10);
                add(10);
                add(10);
                add(10);
            }
        };

        List someList = new ArrayList<>();
        List someList2 = new LinkedList<>();

//        someList2.get(1);


        Rectangle newRectangle = new Rectangle(10, 10);
        Rectangle secondRectangle = newRectangle;
        Set hashSet = new HashSet();
        hashSet.add(new Rectangle(10, 10));
        hashSet.add(new Rectangle(10, 10));

        Set treeSet = new TreeSet();
        treeSet.add(new Rectangle(10, 10));
        treeSet.add(new Rectangle(10, 11));
        System.out.println("TREESET SIZE = " + treeSet.size());

        TreeSet squares = new TreeSet(new SquareComparator());
        squares.add(new Square(666));
        squares.add(new Square(20));
        squares.add(new Square(10));
        squares.add(new Square(12));
        squares.add(new Square(14));
        squares.add(new Square(17));
        squares.add(new Square(777));
//        System.out.println(squares);

        List squaresList = new ArrayList();
        squaresList.add(new Square(666));
        squaresList.add(new Square(20));
        squaresList.add(new Square(10));
        squaresList.add(new Square(12));
        squaresList.add(new Square(14));
        squaresList.add(new Square(17));
        squaresList.add(new Square(777));
        System.out.println(squaresList);
        Collections.sort(squaresList, new SquareComparator());
        System.out.println(squaresList);

        Map map = new HashMap();
        map.put("12014131314", "Giorgi Dadiani");
        map.put("asdasdasd", "Daviti Lobzhanidze");
        map.put("12014131314", "Amiran Khiladze");
        System.out.println(map.keySet());

        map.get("asdasdasd"); // returns "Daviti Lobzhanidze"
        map.remove("asdasdasd");
        Map map2 = new TreeMap();

    }
}
