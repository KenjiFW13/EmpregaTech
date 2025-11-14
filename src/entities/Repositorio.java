package entities;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    List<Empresa> empresas;
    List<Vaga> vagas;

    public Repositorio(){
        empresas = new ArrayList<>();
        vagas = new ArrayList<>();
    }

    public void adicionarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public void adicionarVaga(Vaga vaga){
        vagas.add(vaga);
    }
}
