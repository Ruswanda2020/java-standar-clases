package java_standar_clases;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date date=new Date(173404800000L);

        System.out.println(date);

        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,2001);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY,11);

        Date result=calendar.getTime();
        System.out.println(result);



    }
}
