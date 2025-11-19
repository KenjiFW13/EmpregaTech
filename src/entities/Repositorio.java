package entities;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    public List<Empresa> empresas;
    public List<Vaga> vagas;
    public List<Usuario> usuarios;

    public Repositorio(){
        empresas = new ArrayList<>();
        vagas = new ArrayList<>();
        usuarios = new ArrayList<>();
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
    // Método de listar empresas, se a lista estiver vazia, não retornará nada

    public void listarVagas(){
        if (vagas.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        for (Vaga vaga : vagas) {
            System.out.println(vaga.toString());
        }
    }
    // Método de listar vagas, se a lista estiver vazia, não retornará nada

    public List<Vaga> getVagas() {
        return vagas;
    }
    // Método para pegar todas as vagas cadastradas no sistema

    public int getTotalEmpresas(){
        return empresas.size();
    }
    // Esse método retorna o tamanho da lista empresas, útil para conseguir acessar a lista em outras classes que não estão no mesmo pacote que esta classe

    public int getTotalVagas(){
        return vagas.size();
    }
    // Mesma coisa que o método de cima, mas com a lista vagas

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    // Método para adicionar um usuário à lista

    public List<Usuario> getUsuarios(){
        return usuarios;
    }
    // Método para retornar a lista de usuários

    public int getTotalUsuarios(){
        return usuarios.size();
    }
    // Método para retornar tamanho da lista de Usuarios

    public void listarUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }
    }
    // Método para listar usuarios
}
