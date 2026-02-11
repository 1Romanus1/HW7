import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        System.out.println();

        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i] + ", ");
        }

        System.out.println();

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
            }
        }

        System.out.println(Arrays.toString(weight));

        System.out.println();

        double[] dWeight = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < dWeight.length; i++) {
            System.out.println(dWeight[i]);
        }

        System.out.println();

        for (int i = 0; i < dWeight.length; i++) {
            System.out.print(dWeight[i] + ", ");
        }

        System.out.println();

        for (int i = dWeight.length - 1; i >= 0; i--) {
            System.out.print(dWeight[i] + ", ");
        }
    }
}