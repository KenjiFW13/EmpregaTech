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
    // Método de adicionar Empresas, puxado da classe Menu

    public void adicionarVaga(Vaga vaga){
        vagas.add(vaga);
    }
    // Método de adicionar Vagas, puxado da classe Menu

    public void listarEmpresas(){
        if (empresas.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        for (Empresa empresa : empresas) {
            System.out.println(empresa.toString());
        }
    }
    // Método de listar empresas, puxa da classe Menu

    public void listarVagas(){
        if (vagas.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        for (Vaga vaga : vagas) {
            System.out.println(vaga.toString());
        }
    }
    // Método de listar vagas, puxa da classe Menu
}
