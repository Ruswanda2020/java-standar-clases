package java_standar_clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RagexApp {
    public static void main(String[] args) {

        String name="ruswanda dirganta kumolowongso";

        Pattern pattern=Pattern.compile("[a-zA-Z]*[g][a-zA-Z]*");
        Matcher matcher=pattern.matcher(name);

        while (matcher.find()){
            String result=matcher.group();
            System.out.println(result);
        }


    }
}
