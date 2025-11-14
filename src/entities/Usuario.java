package entities;

public class Usuario {
    private int id;
    private String nome, email, areaDeInteresse, nivelExperiencia, idiomaPrincipal;
    private Boolean PCD;

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

    public Boolean getPCD() {
        return PCD;
    }

    public void setPCD(Boolean PCD) {
        this.PCD = PCD;
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
                ", PCD=" + PCD +
                '}';
    }
}
