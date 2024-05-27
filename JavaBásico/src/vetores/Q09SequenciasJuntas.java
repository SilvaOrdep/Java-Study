package vetores;

import java.util.Scanner;

public class Q09SequenciasJuntas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        int[] d = new int[10];
        int ta = 0, tb = 0, num, tc = 0, i, k, td = 0;
        System.out.println("Conjunto A");
        do {
            System.out.println("Informe um numero ou 999: ");
            num = sc.nextInt();
            if (num != 999) {
                a[ta] = num;
                ta++;
            }
        } while ((num != 999) && (ta < 10));

        System.out.println("Conjunto B");
        do {
            System.out.println("Informe um numero ou 999: ");
            num = sc.nextInt();
            if (num != 999) {
                b[tb] = num;
                tb++;
            }
        } while ((num != 999) && (tb < 10));

        for (tc = 0; tc < ta; tc++) {
            c[tc] = a[tc];
        }

        for (i = 0; i < tb; i++) {
            for (k = 0; k < tc; k++) {
                if (b[i] == c[k]) {
                    break;
                }
            }
            if (k == tc) {
                c[tc] = b[i];
                tc++;
            }
        }

        System.out.println("O vetor uniao é igual: ");
        for (i = 0; i < tc; i++) {
            System.out.println(c[i]);
        }

        for (i = 0; i < ta; i++) {
            for (k = 0; k < tb; k++) {
                if (a[i] == b[k]) {
                    break;
                }
            }
            if (k == tb) {
                d[td] = a[i];
                td++;
            }
        }

        System.out.println("O vetor A Complementar B é igual: ");
        for (i = 0; i < td; i++) {
            System.out.println(d[i]);
        }
    }
}