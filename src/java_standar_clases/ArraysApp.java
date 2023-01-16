package java_standar_clases;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] number={
            7,1,5,6,7,3,4,787,78,7878,778,
        };

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.binarySearch(number,7));
        System.out.println(Arrays.binarySearch(number,12));
        System.out.println(Arrays.binarySearch(number,4));

        int[] result=Arrays.copyOf(number,6);
        System.out.println(Arrays.toString(result));

        int[] result2=Arrays.copyOfRange(number,6,10);
        System.out.println(Arrays.toString(result2));

    }
}
