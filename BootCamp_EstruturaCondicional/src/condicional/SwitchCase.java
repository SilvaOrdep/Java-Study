package condicional;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String tamanho = "";
        System.out.println("qual seu tamanho bro?");
        tamanho = sc.next();

        switch (tamanho) {
        case "P":
            System.out.println("pequeno");
            break;
        case "M":
            System.out.println("medio");
            break;
        case "G":
            System.out.println("grande");
            break;
        default: 
            System.out.println("indefinido");
        }
        sc.close();
    }

}