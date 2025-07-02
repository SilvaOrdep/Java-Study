package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionaTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefas.isEmpty()) {
            if (tarefas.contains(descricao)) {
                tarefas.remove(descricao);
            } else {
                System.out.println("Tarefa não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibeTarefas() {
        System.out.println(tarefas);
    }


    public void marcarTarefa(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.getStatus()) {
                t.setStatus(true);
                break;
            } else if (t.getDescricao().equalsIgnoreCase(descricao) && t.getStatus()) {
                System.out.println("Tarefa já está marcada!");
                break;
            }
        }
    }

    public void desmarcarTarefa(String descricao) {
        int control = 0;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && t.getStatus()) {
                t.setStatus(false);
                control = 1;
                break;
            }
        }
        if (control == 1) {
            System.out.println("A tarefa " + "'" + descricao + "'" + " foi desmarcada");
        } else {
            System.out.println("Não foi possível fazer essa operação, a tarefa não está marcada");
        }
        control = 0;
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (t.getStatus()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (!t.getStatus()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void contarTarefas() {
        System.out.println("Qtd de tarefas: " + tarefas.size());
    }

    public void rmoverTudo() {
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionaTarefa("Tarefa 1");
        listaTarefas.adicionaTarefa("Tarefa 1");
        listaTarefas.adicionaTarefa("Tarefa 2");
        listaTarefas.adicionaTarefa("Tarefa 3");
        listaTarefas.adicionaTarefa("Tarefa 4");

        listaTarefas.exibeTarefas();

        listaTarefas.marcarTarefa("Tarefa 1");
        listaTarefas.marcarTarefa("Tarefa 2");
        listaTarefas.marcarTarefa("Tarefa 3");
        listaTarefas.marcarTarefa("Tarefa 3");

        listaTarefas.exibeTarefas();

        listaTarefas.desmarcarTarefa("Tarefa 3");
        listaTarefas.desmarcarTarefa("Tarefa 4");

        listaTarefas.exibeTarefas();

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.contarTarefas();
        listaTarefas.rmoverTudo();
        listaTarefas.contarTarefas();
    }
}