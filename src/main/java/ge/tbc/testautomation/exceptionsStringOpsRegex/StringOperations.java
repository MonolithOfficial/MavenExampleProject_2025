package ge.tbc.testautomation.exceptionsStringOpsRegex;

public class StringOperations {
    public static void main(String[] args) {
        String text = "something"; // initialize with a literal, string pool, heap
        String text2 = "something";
        int number = 2; // stack

        String sentence = "Spiderman could not complete a backflip.";
        String sentence2 = "   spiderman coUld not coMplete a backflip.  ";
        System.out.println(sentence.equals(sentence2));
        System.out.println(sentence.equalsIgnoreCase(sentence2));
        String lowerCaseSentence = sentence.toLowerCase();
//        char i = sentence.charAt(2);
//        for (int i = 0; i < sentence.length(); i++){
//            System.out.println(sentence.charAt(i));
//        }

//        int index = sentence.lastIndexOf("complete");
        int index = sentence.indexOf("complete");
        int size = "complete".length();
        String formattedString = sentence.substring(index + size, sentence.indexOf('.') + 1);
        System.out.println(formattedString);

        sentence2.strip();
        sentence2.stripLeading();

        String absolutePath = "C:\\Users\\Monolith\\IdeaProjects\\Java-2025-2\\src\\main\\java\\tbc.ge\\ge\\tbc\\testautomation\\exceptionsStringOpsRegex\\StringOperations.java";
        // ge.tbc.testautomation.exceptionsStringOpsRegex.StringOperations
        String changedString = absolutePath.substring(absolutePath.indexOf("\\ge\\") + 1);
        System.out.println(changedString);
        changedString = changedString.replaceAll("\\\\", ".").replaceAll(".java", "");
        System.out.println(changedString);

//        System.out.println(index);
//        System.out.println(text == text2);
    }
}
