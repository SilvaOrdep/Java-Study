package vetores;

import java.util.Scanner;

public class Q08Anagramas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra1, palavra2;
        char p1[], p2[];
        System.out.println("Informe a primeira palavra: ");
        palavra1 = sc.next();
        p1 = palavra1.toCharArray();
        int t1 = p1.length;
        System.out.println("Informe a segunda palavra: ");
        palavra2 = sc.next();
        p2 = palavra2.toCharArray();
        int t2 = p2.length;
        int i, k, achou = 0;
        for (i = 0; i < t1; i++) {
            for (k = 0; k < t2; k++) {
                if (p1[i] == p2[k]) {
                    p2[k] = ' ';
                    achou++;
                    break;
                }
            }
            if (k == t2) {
                break;
            }
        }
        if ((achou == t1) && (achou == t2)) {
            System.out.println("As palavras são anagramas");
        } else {
            System.out.println("As palavras não são anagramas");
        }
    }
}