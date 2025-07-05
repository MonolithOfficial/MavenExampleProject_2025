package ge.tbc.testautomation.exceptionsStringOpsRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String text = "555134134";
        String regex = "((555)(\\d{6}))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()){
            System.out.println("GEORGIAN GEOCELL NUMBER");
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
        else {
            System.out.println("NOT GEORGIAN GEOCELL NUMBER");
        }

    }
}
