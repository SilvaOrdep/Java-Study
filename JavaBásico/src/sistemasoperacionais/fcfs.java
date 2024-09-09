package sistemasoperacionais;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class fcfs {
    public static void main(String[] args) {
        // declaracao de variaveis
        Scanner scanner = new Scanner(System.in);
        int N, entrada, tempoAtual;
        double tempoExecucao, tempoEspera;
        ArrayList processos, ingressos, duracoes, temposFinais, temposIniciais;
        int contTeste = 0;
        N = scanner.nextInt();
        String formato, saida;
        DecimalFormat nf = new DecimalFormat("0.00");

        while (N != 0) {
            contTeste++;
            // inicializacao de variaveis
            processos = new ArrayList();
            ingressos = new ArrayList();
            duracoes = new ArrayList();
            temposFinais = new ArrayList();
            temposIniciais = new ArrayList();
            tempoEspera = 0;
            tempoExecucao = 0;

            for (int i = 1; i <= N; i++) {
                // adiciona processo a lista de processos
                processos.add(i);

                // le e adiciona ingresso no processo i
                entrada = scanner.nextInt();
                ingressos.add(entrada);

                // le e adiciona duracao do processo i
                entrada = scanner.nextInt();
                duracoes.add(entrada);
            }

            // tempo inicial = tempo de ingresso do primeiro processo
            tempoAtual = ingressos.get(0);

            // adicionando tempos de inicio e termino dos processos
            for (int i = 0; i < N; i++) {
                if (ingressos.get(i) > tempoAtual) {
                    tempoAtual = ingressos.get(i);
                }
                temposIniciais.add(tempoAtual);
                tempoAtual += duracoes.get(i);
                temposFinais.add(tempoAtual);
            }

            // calculo dos tempos medios de espera e execucao
            for (int i = 0; i < N; i++) {
                tempoExecucao += temposFinais.get(i) - ingressos.get(i);
                tempoEspera += temposIniciais.get(i) - ingressos.get(i);
            }
            tempoExecucao = tempoExecucao / N;
            tempoEspera = tempoEspera / N;
            System.out.println("Teste " + contTeste);

            formato = nf.format(tempoExecucao);
            saida = "Tempo medio de execucao: " + formato + "s";
            saida = saida.replace(".", ",");
            System.out.println(saida);

            formato = nf.format(tempoEspera);
            saida = "Tempo medio de espera: " + formato + "s";
            saida = saida.replace(".", ",");
            System.out.println(saida);

            // ordem dos processos = em tempo de entrada
            for (int i = 0; i < N; i++) {
                System.out.print("P" + processos.get(i) + " ");
            }
            System.out.println();
            System.out.println();
            N = scanner.nextInt();
        }
    }
}