package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.abstractClassesAndInterfaces.Rectangle;

import java.util.Collection;

public class Tuple<E, T> {
//public class Tuple<E, T extends Collection<?>> {
    private E elementOne;
    private T elementTwo;

    public Tuple(){

    }

    public Tuple(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public E getElementOne() {
        return elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }
}
