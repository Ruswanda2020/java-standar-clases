package java_standar_clases;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {

        String name="Ruswanda Dirgantara Falefi";
        String lowercase=name.toLowerCase();
        String nameUppercase=name.toUpperCase();

        System.out.println(name);
        System.out.println(lowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Ruswanda"));
        System.out.println(name.endsWith("Falefi"));

        String[] names=name.split(" ");
        for (var valu:names){
            System.out.println(valu);
        }

        System.out.println(" ".isBlank());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(1));

        char[] chars=name.toCharArray();

        System.out.println(chars);



    }
}
