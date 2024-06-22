package matrizes;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int l = 3;
        final int c = 3;
        boolean empate = false, vitoria = false;
        int linha, coluna, opcao, jogadas = 0, vez = 1;
        char[][] v = new char[l][c];

        do {
            opcao = 0;
            System.out.println("1- Novo Jogo \n2- Instruções \n3- Sair");
            opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    vitoria = false;
                    empate = false;
                    jogadas = 0;
                    System.out.println(
                            "+--------------------------------------------------------------------------------------------------+");
                    System.out.println("\n"
                            + "     ██  ██████   ██████   ██████      ██████   █████      ██    ██ ███████ ██      ██   ██  █████  \n"
                            + "     ██ ██    ██ ██       ██    ██     ██   ██ ██   ██     ██    ██ ██      ██      ██   ██ ██   ██ \n"
                            + "     ██ ██    ██ ██   ███ ██    ██     ██   ██ ███████     ██    ██ █████   ██      ███████ ███████ \n"
                            + "██   ██ ██    ██ ██    ██ ██    ██     ██   ██ ██   ██      ██  ██  ██      ██      ██   ██ ██   ██ \n"
                            + " █████   ██████   ██████   ██████      ██████  ██   ██       ████   ███████ ███████ ██   ██ ██   ██ \n");
                    System.out.println(
                            "+--------------------------------------------------------------------------------------------------+");
                    System.out.println("               ");

                    // MONTAR jogo:
                    montarJogo(v, l, c);

                    // VEZ DO X
                    do {
                        if (vez == 1) {
                            System.out.println("Vez do X");
                            System.out.println("Onde você quer jogar?");
                            System.out.println("Digite a linha e a coluna:");
                            linha = sc.nextInt();
                            coluna = sc.nextInt();
                            linha--;
                            coluna--;
                            // Verificando se a posição digitada existe
                            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                                System.out.println("Digite uma posição valida!!!");
                                continue;
                            }
                            // Verificando se a posição está ocupada
                            if ((v[linha][coluna] == 'X') || (v[linha][coluna] == 'O')) {
                                System.out.println("Essa posição ja está ocupada!");
                                linha = 0;
                                coluna = 0;
                                continue;
                            }
                            if ((linha >= 0 && linha < 3) && (coluna >= 0 && coluna < 3)) {
                                v[linha][coluna] = 'X';
                                vez = 0;
                            }

                            // Mostrar jogo:
                            mostrarJogo(v, l, c);

                            // Condição de vitoria X
                            if (vitoriaX(v) == true) {
                                mostrarResultado(1);
                                vitoria = true;
                                break;
                            }						// Condição para empate
                            jogadas++;
                            if (jogadas == 9 && vitoria == false) {
                                empate = true;
                                mostrarResultado(2);
                                break;
                            }
                        } else {
                            // Vez do O
                            System.out.println("Vez do O");
                            System.out.println("Onde você quer jogar?");
                            System.out.println("Digite a linha e a coluna:");
                            linha = sc.nextInt();
                            coluna = sc.nextInt();
                            linha--;
                            coluna--;
                            // Verificando se a posição digitada existe
                            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                                System.out.println("Digite uma posição valida!!!");
                                continue;
                            }
                            // Verificando se a posição está ocupada
                            if ((v[linha][coluna] == 'X') || (v[linha][coluna] == 'O')) {
                                System.out.println("Essa posição ja está ocupada!");
                                linha = 0;
                                coluna = 0;
                                continue;
                            }
                            // Colocando o O no espaço
                            if ((linha >= 0 && linha < 3) && (coluna >= 0 && coluna < 3)) {
                                v[linha][coluna] = 'O';
                                vez = 1;
                            }

                            // Mostrar jogo:
                            mostrarJogo(v, l, c);

                            // Condição de vitoria
                            if (vitoriaO(v) == true) {
                                mostrarResultado(0);
                                vitoria = true;
                                break;
                            } // Condição para empate
                            jogadas++;
                            if (jogadas == 9 && vitoria == false) {
                                empate = true;
                                mostrarResultado(2);
                                break;
                            }
                        }
                    } while (vitoria == false);
                    vez = 1;
                    break;
                case 2:
                    System.out.println("Para escolher a posição, utilize os numeros a seguir:");
                    System.out
                            .println("L=1,C=1|L=1,C=2|L=1,C=3" + "\nL=2,C=1|L=2,C=2|L=2,C=3" + "\nL=3,C=1|L=3,C=2|L=3,C=3");
                    break;
            }
        } while (opcao != 3);
    }

    public static void mostrarResultado(int num) {
        if (num == 1) {
            System.out.println("VITORIA DO X");
        } else if (num == 0) {
            System.out.println("VITORIA DO O");
        } else if (num == 2) {
            System.out.println("\n" + "██    ██ ███████ ██      ██   ██  █████  \n"
                    + "██    ██ ██      ██      ██   ██ ██   ██ \n" + "██    ██ █████   ██      ███████ ███████ \n"
                    + " ██  ██  ██      ██      ██   ██ ██   ██ \n" + "  ████   ███████ ███████ ██   ██ ██   ██ \n"
                    + "                                         \n");
        }
    }

    public static void montarJogo(char[][] v, int l, int c) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                v[i][j] = ' ';
                if (j == c - 1) {
                    System.out.printf("%c", v[i][j]);
                } else {
                    System.out.printf("%c | ", v[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void mostrarJogo(char[][] v, int l, int c) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (j == c - 1) {
                    System.out.printf("%c", v[i][j]);
                } else {
                    System.out.printf("%c | ", v[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static boolean vitoriaO(char[][] mat) {
        if ((mat[0][0] == 'O' && mat[0][1] == 'O' && mat[0][2] == 'O')
                || (mat[1][0] == 'O' && mat[1][1] == 'O' && mat[1][2] == 'O')
                || (mat[2][0] == 'O' && mat[2][1] == 'O' && mat[2][2] == 'O')) {
            return true;
        }
        if (((mat[0][0] == 'O' && mat[1][0] == 'O' && mat[2][0] == 'O')
                || (mat[0][1] == 'O' && mat[1][1] == 'O' && mat[2][1] == 'O'))
                || (mat[0][2] == 'O' && mat[1][2] == 'O' && mat[2][2] == 'O')) {
            return true;
        }
        if ((mat[0][0] == 'O' && mat[1][1] == 'O' && mat[2][2] == 'O')
                || (mat[0][2] == 'O' && mat[1][1] == 'O' && mat[2][0] == 'O')) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean vitoriaX(char[][] mat) {
        if ((mat[0][0] == 'X' && mat[0][1] == 'X' && mat[0][2] == 'X')
                || (mat[1][0] == 'X' && mat[1][1] == 'X' && mat[1][2] == 'X')
                || (mat[2][0] == 'X' && mat[2][1] == 'X' && mat[2][2] == 'X')) {
            return true;
        }
        if (((mat[0][0] == 'X' && mat[1][0] == 'X' && mat[2][0] == 'X')
                || (mat[0][1] == 'X' && mat[1][1] == 'X' && mat[2][1] == 'X'))
                || (mat[0][2] == 'X' && mat[1][2] == 'X' && mat[2][2] == 'X')) {
            return true;
        }
        if ((mat[0][0] == 'X' && mat[1][1] == 'X' && mat[2][2] == 'X')
                || (mat[0][2] == 'X' && mat[1][1] == 'X' && mat[2][0] == 'X')) {
            return true;
        } else {
            return false;
        }
    }
}