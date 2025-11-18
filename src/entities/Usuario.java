package entities;

public class Usuario {
    private int id;
    private String nome, email, areaDeInteresse, nivelExperiencia, idiomaPrincipal, CEP;
    private boolean buscaInclusao;


    public Usuario(int id, String nome, String email, String areaDeInteresse, String nivelExperiencia,
                   String idiomaPrincipal, String CEP, boolean pcd) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.areaDeInteresse = areaDeInteresse;
        this.nivelExperiencia = nivelExperiencia;
        this.idiomaPrincipal = idiomaPrincipal;
        this.CEP = CEP;
        this.buscaInclusao = pcd;
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

    public String getAreaDeInteresse() {
        return areaDeInteresse;
    }

    public void setAreaDeInteresse(String areaDeInteresse) {
        this.areaDeInteresse = areaDeInteresse;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getIdiomaPrincipal() {
        return idiomaPrincipal;
    }

    public void setIdiomaPrincipal(String idiomaPrincipal) {
        this.idiomaPrincipal = idiomaPrincipal;
    }

    public boolean getBuscaInclusao() {
        return buscaInclusao;
    }

    public void setBuscaInclusao(boolean buscaInclusao) {
        this.buscaInclusao = buscaInclusao;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + id +
                ", Nome='" + nome + '\'' +
                ", E-mail='" + email + '\'' +
                ", Área de Interesse='" + areaDeInteresse + '\'' +
                ", Nível de Experiência='" + nivelExperiencia + '\'' +
                ", Idioma Principal='" + idiomaPrincipal + '\'' +
                ", CEP='" + CEP + '\'' +
                ", buscaInclusao=" + (buscaInclusao ? "Sim" : "Não") +
                '}';
    }
}
