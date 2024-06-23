package set.pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        status = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        String cond;
        if (status){
            cond = "(X)";
        } else {
            cond = "( )";
        }
        return "{" + descricao + cond+ "}";
    }
}
