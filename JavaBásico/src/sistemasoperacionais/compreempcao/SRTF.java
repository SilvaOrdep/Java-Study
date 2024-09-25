package sistemasoperacionais.compreempcao;

import java.util.Scanner;

public class SRTF {
    // Method to find the waiting time for all
    // processes
    static void findWaitingTime(Processo proc[], int n, int wt[]) {
        int rt[] = new int[n];

        // Copy the burst time into rt[]
        for (int i = 0; i < n; i++)
            rt[i] = proc[i].bt;

        int complete = 0, t = 0, minm = Integer.MAX_VALUE;
        int shortest = 0, finish_time;
        boolean check = false;

        // Process until all processes gets
        // completed
        while (complete != n) {

            // Find process with minimum
            // remaining time among the
            // processes that arrives till the
            // current time`
            for (int j = 0; j < n; j++) {
                if ((proc[j].art <= t) && (rt[j] < minm) && rt[j] > 0) {
                    minm = rt[j];
                    shortest = j;
                    check = true;
                }
            }

            if (check == false) {
                t++;
                continue;
            }

            // Reduce remaining time by one
            rt[shortest]--;

            // Update minimum
            minm = rt[shortest];
            if (minm == 0)
                minm = Integer.MAX_VALUE;

            // If a process gets completely
            // executed
            if (rt[shortest] == 0) {

                // Increment complete
                complete++;
                check = false;

                // Find finish time of current
                // process
                finish_time = t + 1;

                // Calculate waiting time
                wt[shortest] = finish_time - proc[shortest].bt - proc[shortest].art;

                if (wt[shortest] < 0)
                    wt[shortest] = 0;
            }
            // Increment time
            t++;
        }
    }

    // Method to calculate turn around time
    static void findTurnAroundTime(Processo proc[], int n, int wt[], int tat[]) {
        // calculating turnaround time by adding
        // bt[i] + wt[i]
        for (int i = 0; i < n; i++)
            tat[i] = proc[i].bt + wt[i];
    }

    // Method to calculate average time
    static void findavgTime(Processo proc[], int n) {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        // Function to find waiting time of all
        // processes
        findWaitingTime(proc, n, wt);

        // Function to find turn around time for
        // all processes
        findTurnAroundTime(proc, n, wt, tat);

        // Display processes along with all
        // details
        System.out.println("Processos " + " Tempo estimado "
                + " Tempo de espera " + " Tempo de saída ");

        // Calculate total waiting time and
        // total turnaround time
        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.println(" " + proc[i].pid + "\t\t" + proc[i].bt + "\t\t " + wt[i] + "\t\t" + tat[i]);
        }

        System.out.println("Tempo de espera médio = " + (float) total_wt / (float) n);
        System.out.println("Tempo de saída médio = " + (float) total_tat / (float) n);
    }

    // Driver Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de processos:");
        int qtdProc = sc.nextInt();
        Processo proc[] = new Processo[qtdProc];
        int id=1;
        System.out.println("Digite o tempo estimado(surto) e tempo de chegada de cada processo:");
        for (int i = 0; i < proc.length; i++) {
            int surto, chegada;
            System.out.println("Proc["+(i+1)+"]: ");
            surto = sc.nextInt();
            chegada = sc.nextInt();
            proc[i]=new Processo(id, surto, chegada);
            id++;
        }
        System.out.println("Algoritmo de escalonamento SJF(com preempção)\nTempo de chegada de cada processo: ");
        for (int i = 0; i < proc.length; i++) {
            System.out.print("Proc["+(i+1)+"]: "+proc[i].art+"\n");

        }
        //Process proc[] = { new Process(1, 7, 0), new Process(2, 4, 2), new Process(3, 1, 4), new Process(4, 4, 5) };
        findavgTime(proc, proc.length);
    }
}
