package java_standar_clases;

public class NumberApp {
    public static void main(String[] args) {

        Integer intvalu=10;
        Long longvalue=intvalu.longValue();
        Double doublevalue=intvalu.doubleValue();
        Short value=doublevalue.shortValue();

        System.out.println(value);

        String number="1000";

        double konversi=Double.parseDouble(number);
        System.out.println(konversi);



    }
}
