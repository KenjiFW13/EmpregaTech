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
}
