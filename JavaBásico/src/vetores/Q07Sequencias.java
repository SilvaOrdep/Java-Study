package vetores;

import java.util.Scanner;

public class Q07Sequencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1[] = new int[20];
        int v2[] = new int[20];
        int i = 0, k = 0, t1 = 0, t2 = 0;
        char continuar;
        do {
            System.out.println("Informe um número: ");
            v1[t1] = sc.nextInt();
            System.out.println("Continuar (s)im ou (n)ão? ");
            continuar = sc.next().charAt(0);
            t1++;
        } while ((continuar == 's') && (t1 < 20));

        for (i = 0; i < t1; i++) {
            for (k = 0; k < t2; k++) {
                if (v1[i] == v2[k]) {
                    break;
                }
            }
            if (k == t2) {
                v2[t2] = v1[i];
                t2++;
            }
        }
        System.out.println("Os n~umeros sem repetição: ");
        for (k = 0; k < t2; k++) {
            System.out.println(v2[k]);
        }
    }
}