package vetores;

import java.util.Scanner;

public class Q10VetorOrdenado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int arm = 0;
        System.out.println("Digite uma sequencia:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    arm = a[i];
                    a[i] = a[j];
                    a[j] = arm;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}