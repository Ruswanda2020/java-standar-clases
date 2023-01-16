package java_standar_clases;

import java.util.Random;

public class RendomApp{
    public static void main(String[] args) {

        Random random=new Random();

        for ( var i=0;i < 1000;i++){
            int value=random.nextInt(1000);
            System.out.println(value);

        }
    }
}
