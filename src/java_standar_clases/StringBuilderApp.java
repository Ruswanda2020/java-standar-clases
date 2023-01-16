package java_standar_clases;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder bulder=new StringBuilder();
        bulder.append("rus");
        bulder.append(" ");
        bulder.append("wanda");

        String name=bulder.toString();
        System.out.println(name);
    }
}
