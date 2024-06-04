package matrizes;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int l = 3;
        final int c = 3;
        boolean empate = false, vitoria = false;
        int linha, coluna, jogar, opcao, cont = 0;
        char[][] v = new char[l][c];

        do {
            opcao = 0;
            System.out.println("1- Novo Jogo \n2- Instruções \n3- Sair");
            opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println("+-------------+");
                    System.out.println("|Jogo da velha|");
                    System.out.println("+_____+");
                    System.out.println("               ");

                    // Mostrar o jogo!!!!

                    for (int i = 0; i < l; i++) {
                        for (int j = 0; j < c; j++) {
                            v[i][j] = ' ';
                            System.out.printf("  |", v[i][j]);
                        }
                        System.out.println("");
                    }
                    // VEZ DO X
                    do {
                        System.out.println("Vez do X");
                        System.out.println("Onde você quer jogar?");
                        System.out.println("Digite a linha e a coluna:");
                        linha = sc.nextInt();
                        coluna = sc.nextInt();
                        linha--;
                        coluna--;
                        //Verificando se a posição está ocupada
                        if ((v[linha][coluna] == 'X') || (v[linha][coluna] == 'O')) {
                            System.out.println("Essa posição ja está ocupada!");
                            linha = 0;
                            coluna = 0;
                        }
                        //Verificando se a posição digitada existe
                        if ((linha >= 0 && linha < 3) && (coluna >= 0 && coluna < 3)) {
                            v[linha][coluna] = 'X';

                        } else {
                            System.out.println("Digite uma posição valida!!!");
                            break;
                        }
                        for (int i = 0; i < v.length; i++) {
                            for (int j = 0; j < v.length; j++) {
                                System.out.printf("%c |", v[i][j]);
                            }
                            System.out.println("");
                        } // Condição de vitoria X
                        // Horizontal
                        if ((v[0][0] == 'X' && v[0][1] == 'X' && v[0][2] == 'X')
                                || (v[1][0] == 'X' && v[1][1] == 'X' && v[1][2] == 'X')
                                || (v[2][0] == 'X' && v[2][1] == 'X' && v[2][2] == 'X')) {
                            System.out.println(" VITORIA DO X");
                            break;
                        }
                        // Vertical
                        if (((v[0][0] == 'X' && v[1][0] == 'X' && v[2][0] == 'X')
                                || (v[0][1] == 'X' && v[1][1] == 'X' && v[2][1] == 'X'))
                                || (v[0][2] == 'X' && v[1][2] == 'X' && v[2][2] == 'X')) {
                            System.out.println(" VITORIA DO X");
                            vitoria = true;
                            break;
                        } // Diagonal
                        if ((v[0][2] == 'X' && v[0][2] == 'X' && v[0][2] == 'X')
                                || (v[0][2] == 'X' && v[0][2] == 'X' && v[0][2] == 'X')) {
                            System.out.println(" VITORIA DO X");
                            vitoria = true;
                            break;

                        }
                        // Vez do O
                        System.out.println("Vez do O");
                        System.out.println("Onde você quer jogar?");
                        System.out.println("Digite a linha e a coluna:");
                        linha = sc.nextInt();
                        coluna = sc.nextInt();
                        if ((v[linha][coluna] == 'X') || (v[linha][coluna] == 'O')) {
                            System.out.println("Essa posição ja está ocupada!");
                            linha = 0;
                            coluna = 0;
                        }
                        if ((linha >= 0 && linha < 3) && (coluna >= 0 && coluna < 3)) {
                            v[linha][coluna] = 'O';

                        } else {
                            System.out.println("Digite uma posição valida!!!");
                            break;
                        }

                        for (int i = 0; i < v.length; i++) {
                            for (int j = 0; j < v.length; j++) {
                                System.out.printf("%c |", v[i][j]);
                            }
                            System.out.println("");
                        }
                        // Condição de vitoria

                        // Horizontal
                        if ((v[0][0] == 'O' && v[0][1] == 'O' && v[0][2] == 'O')
                                || (v[1][0] == 'O' && v[1][1] == 'O' && v[1][2] == 'O')
                                || (v[2][0] == 'O' && v[2][1] == 'O' && v[2][2] == 'O')) {
                            System.out.println(" VITORIA DO O");
                            vitoria = true;
                            break;
                        } // Vertical
                        if (((v[0][0] == 'O' && v[1][0] == 'O' && v[2][0] == 'O')
                                || (v[0][1] == 'O' && v[1][1] == 'O' && v[2][1] == 'O'))
                                || (v[0][2] == 'O' && v[1][2] == 'O' && v[2][2] == 'O')) {
                            System.out.println(" VITORIA DO O");
                            vitoria = true;
                            break;
                        } // Diagonal
                        if ((v[0][2] == 'O' && v[0][2] == 'O' && v[0][2] == 'O')
                                || (v[0][2] == 'O' && v[0][2] == 'O' && v[0][2] == 'O')) {
                            System.out.println(" VITORIA DO O");
                            vitoria = true;
                            break;
                        }
                        if (vitoria = false) {
                            empate = true;
                        }
                    } while (vitoria = false);
                    break;
                case 2:
                    System.out.println("Para escolher a posição, utilize os numeros a seguir:");
                    System.out.println("L=1,C=1|L=1,C=2|L=1,C=3" + "\nL=2,C=1|L=2,C=2|L=2,C=3" + "\nL=3,C=1|L=3,C=2|L=3,C=3");
                    break;
            }
        } while (opcao != 3);
    }

}


