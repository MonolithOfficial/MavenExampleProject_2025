package ge.tbc.testautomation.introductionAndOOP;

public class Main {
    public static void main(String[] args) {
        int number; // declaration
        long bigNumber = 213141541255151L;
        number = 10; // initialization

        Integer number2 = 20; //wrapper class
        Long bigNumber2 = 23231241241241L;

        float decimal = 20.12f;
        double doubleValue = 20.34;

//        Float/Double

        boolean value = true;
//        boolean value = false;
//        Boolean - wrapper class

        char letter = 'a';
        Character letter2 = 'b';
        StringBuilder builder = new StringBuilder();
        String builtString = builder.append(letter2)
                .append(letter).toString();
        System.out.println(builder.append(letter2)
                .append(letter));
        String something = String.format("%s some kind of sentence", letter);
        char[] charArray = something.toCharArray();
        int lengthOfSentence = something.length();

        String[] texts = new String[]{"something1", "something2"};

    }
}