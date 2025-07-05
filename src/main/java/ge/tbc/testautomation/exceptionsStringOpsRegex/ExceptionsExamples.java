package ge.tbc.testautomation.exceptionsStringOpsRegex;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsExamples {
    public static void main(String[] args)  {
//        throw new Exception(); // checked

        int[] intArray = new int[]{12, 13, 14};
        try {
            int something = intArray[3];
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally {
            // TODO
        }
//        throw new IndexOutOfBoundsException();
        throw new RuntimeException(); // unchecked

//        try {
//            openFile();
//        } catch (FileNotFoundException e) {
//            System.out.println("FILE COULD NOT BE FOUND.");
//            e.printStackTrace();
//        }
    }

    private static void parseDocument() throws FileNotFoundException, SomeKindOfException {
        openFile();
        throw new SomeKindOfException("A FAIL HAPPENED");
    }

    private static void openFile() throws FileNotFoundException {
        FileReader reader = new FileReader("testng.xml");
        System.out.println("File could not be found");
    }


}
