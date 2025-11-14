package entities;

public class Empresa {
    int id;
    String nome, email, setor;
    boolean compromissoInclusao;

    public Empresa(int id, String nome, String email, String setor, boolean compromissoInclusao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.setor = setor;
        this.compromissoInclusao = compromissoInclusao;
    }
}
