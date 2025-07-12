package ge.tbc.testautomation.annotationsAndStreams;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Streams {
    public static void main(String[] args) {
        List<String> listOfWords = new ArrayList();
        listOfWords.add("spiderman");
        listOfWords.add("has");
        listOfWords.add("been");
        listOfWords.add("defeated");
        listOfWords.add("by");
        listOfWords.add("ilia");
        listOfWords.add("topuria");

//        Predicate<String> filterWordsPredicate = element -> {
//            if (element.contains("e")){
//                return true;
//            }
//            else {
//                return false;
//            }
//        };

        Predicate<String> filterWordsPredicate = element -> element.contains("e");

//        Stream<String> listOfWordsStream = listOfWords.stream()
//                .filter(predicate);
//
//        List<String> newList = listOfWordsStream.toList();
//        Set<String> newSet = listOfWordsStream.collect(Collectors.toSet());

        List<String> newList = listOfWords.stream().filter(filterWordsPredicate)
                .toList();

        // false
        boolean allMatch = listOfWords.stream().allMatch(str -> str.startsWith("s"));

        // true
        boolean anyMatch = listOfWords.stream().anyMatch(str -> str.startsWith("s"));

        // false
        boolean noneMatch = listOfWords.stream().noneMatch(str -> str.startsWith("s"));

        List<String> newList2 = listOfWords.stream().filter(filterWordsPredicate)
                .toList();

        Method[] methods = LibraryClass.class.getDeclaredMethods();
        List<Method> markedMethods = Arrays.stream(methods).filter(method -> {
            if (method.isAnnotationPresent(Marked.class)){
                Marked annotation = method.getAnnotation(Marked.class);
                // you also can get attributes here
                return true;
            }
            else {
                return false;
            }
        }).toList();

        markedMethods.stream().parallel().forEach(System.out::println);
    }
}
