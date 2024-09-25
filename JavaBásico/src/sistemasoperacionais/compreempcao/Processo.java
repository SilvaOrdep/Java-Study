package sistemasoperacionais.compreempcao;

class Processo {
    int pid; // Process ID
    int bt; // Burst Time
    int art; // Arrival Time

    public Processo(int pid, int bt, int art)
    {
        this.pid = pid;
        this.bt = bt;
        this.art = art;
    }
}