package entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    int id;
    String nome, email, setor;
    boolean compromissoInclusao;
    private List<Vaga> vagas;

    public Empresa(int id, String nome, String email, String setor, boolean compromissoInclusao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.setor = setor;
        this.compromissoInclusao = compromissoInclusao;
        this.vagas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isCompromissoInclusao() {
        return compromissoInclusao;
    }

    public void setCompromissoInclusao(boolean compromissoInclusao) {
        this.compromissoInclusao = compromissoInclusao;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "Id=" + id +
                ", Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                ", Setor='" + setor + '\'' +
                ", Compromisso com Inclusão=" + compromissoInclusao +
                '}';
    }
}
