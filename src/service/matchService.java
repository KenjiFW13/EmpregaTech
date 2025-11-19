package service;
import entities.*;

import java.util.List;
import java.util.Scanner;

public class matchService {
    private static Repositorio repositorio;
    private static Scanner scanner;

    public matchService(Repositorio repositorio, Scanner scanner){
        this.repositorio = repositorio;
        this.scanner = scanner;
    }

    public static void buscarVagas(){
        List<Usuario> listaUsuarios = repositorio.usuarios;

        if (listaUsuarios.isEmpty()){
            System.out.println("Não há usuários para realizar o match!");
            return;
        }

        System.out.println("=== Escolha um usuário para buscar vaga ===");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            System.out.println((i + 1) + " - " + usuario.getNome());
        }

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao < 1 || opcao > listaUsuarios.size()) {
            System.out.println("Opção inválida!");
            return;
        }
        // Caso de erro para opção inválida

        Usuario usuarioSelecionado = listaUsuarios.get(opcao - 1);

        System.out.println("Usuário selecionado: " +  usuarioSelecionado.getNome());
        // Selecionador de usuário para realizar match por número/opção
    }
}
