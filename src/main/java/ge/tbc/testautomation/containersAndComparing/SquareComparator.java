package ge.tbc.testautomation.containersAndComparing;

import ge.tbc.testautomation.abstractClassesAndInterfaces.Rectangle;
import ge.tbc.testautomation.inheritanceAndPolymorphism.Square;

import java.util.Comparator;

public class SquareComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Square && o2 instanceof Square){
            Square square1 = (Square) o1;
            Square square2 = (Square) o2;
            return Double.compare(square1.getArea(), square2.getArea());
        }
        return -1;
    }
}

// WITH GENERICS
//public class SquareComparator implements Comparator<Square> {
//    @Override
//    public int compare(Square o1, Square o2) {
//        return Double.compare(o1.getArea(), o2.getArea());
//    }
//}
