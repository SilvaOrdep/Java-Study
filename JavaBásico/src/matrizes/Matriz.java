package matrizes;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {
        int [][] velha = new int[3][3];
        for (int[] value : velha) {
            Arrays.fill(value, 0);
        }
        for (int[] ints : velha) {
            for (int anInt : ints) {
                System.out.printf("%d / ", anInt);
            }
            System.out.println("\n");
        }
    }
}
