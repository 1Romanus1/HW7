import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        double[] dWeight = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < dWeight.length; i++) {
            System.out.println(dWeight[i]);
        }

        int[] iWeight = new int[12];
        for (int i = 0; i < iWeight.length; i++) {
            System.out.println(i);
        }
//Задача 2

        int[] oWeight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int in = 0; in < oWeight.length; in++) {
            System.out.print(oWeight[in]);
            if (in < oWeight.length - 1) {
                System.out.print(", ");
            }
        }
//Задача 3
        System.out.println();
        for (int ind = oWeight.length - 1; ind >= 0; ind--) {
            System.out.print(oWeight[ind]);
            if(ind > 0) {
                System.out.print(", ");
            }
        }
        //Задача 4
        System.out.println();
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            System.out.println(arr[i]);
        }
    }
}