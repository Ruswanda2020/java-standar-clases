package java_standar_clases;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner=new StringJoiner("," ,"[" ,"]");
        joiner.add("rus");
        joiner.add("wanda");

        String name=joiner.toString();
        System.out.println(name);


    }
}



