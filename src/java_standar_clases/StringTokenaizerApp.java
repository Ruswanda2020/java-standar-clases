package java_standar_clases;

import java.util.StringTokenizer;

public class StringTokenaizerApp {
    public static void main(String[] args) {

        String valu="ruswanda dirgantara";
        StringTokenizer tokenizer=new StringTokenizer(valu," ");

        while (tokenizer.hasMoreTokens()){
            String result=tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
