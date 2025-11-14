package entities;

public class Vaga {
    int id;
    String titulo, area, tipoContrato, nivel;
    boolean vagaInclusiva;
    Empresa empresa;

    public Vaga(int id, String titulo, String area, String tipoContrato, String nivel, boolean vagaInclusiva, Empresa empresa) {
        this.id = id;
        this.titulo = titulo;
        this.area = area;
        this.tipoContrato = tipoContrato;
        this.nivel = nivel;
        this.vagaInclusiva = vagaInclusiva;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isVagaInclusiva() {
        return vagaInclusiva;
    }

    public void setVagaInclusiva(boolean vagaInclusiva) {
        this.vagaInclusiva = vagaInclusiva;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "Id=" + id +
                ", Título='" + titulo + '\'' +
                ", Área='" + area + '\'' +
                ", Tipo de Contrato='" + tipoContrato + '\'' +
                ", Nível='" + nivel + '\'' +
                ", Vaga Inclusiva=" + (vagaInclusiva ? "Sim" : "Não") +
                ", Empresa=" + empresa +
                '}';
    }
}
