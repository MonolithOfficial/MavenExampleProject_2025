package ge.tbc.testautomation.annotationsAndStreams;

@Marked(id = 102, title = "class")
public class LibraryClass {
    @Marked(id = 100, title = "variable")
    int someVariable;
    int someOtherVariable;

    @Deprecated(forRemoval = true, since = "1.01")
    public static void someKindOfMethod(){
        System.out.println("I AM DOING SOMETHING");

        int local = 10;
    }

    @Marked(id = 100, title = "method2")
    public static void someKindOfMethod2(){
        System.out.println("I AM DOING SOMETHING");

        int local = 10;
    }

    @Marked(id = 100, title = "method3")
    @Deprecated(forRemoval = true, since = "1.01")
    public static void someKindOfMethod3(){
        System.out.println("I AM DOING SOMETHING");

        int local = 10;
    }

    @Marked(id = 101, title = "constructor")
    public LibraryClass(int someVariable, int someOtherVariable) {
        this.someVariable = someVariable;
        this.someOtherVariable = someOtherVariable;
    }
}
