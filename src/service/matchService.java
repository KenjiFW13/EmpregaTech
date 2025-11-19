package service;
import entities.*;

import java.util.ArrayList;
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
        // Método para realizar o match de vagas com usuários, aqui é selecionado um usuário para realizar o match
        // e em seguida o sistema percorre por todas as vagas cadastradas para recomendar ao usuário, considerando
        // interesses em comum entre usuário e vaga/empresa.
        List<Usuario> listaUsuarios = repositorio.getUsuarios();

        if (listaUsuarios.isEmpty()){
            System.out.println("Não há usuários para realizar o match!");
            return;
        }
        // Caso de erro se não houver usuários cadastrados no sistema

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

        boolean vagaEncontrada = true;

        List<Vaga> vagasCompativeis = new ArrayList<>();

        for (Vaga vaga : repositorio.getVagas()){

            List<String> motivos = new ArrayList<>();

            if (usuarioSelecionado.getAreaDeInteresse().equalsIgnoreCase(vaga.getArea())){
                motivos.add("Área compátivel (" +  vaga.getArea() + ")");
            }

            if (usuarioSelecionado.getNivelExperiencia().equalsIgnoreCase(vaga.getNivel())){
                motivos.add("Nível compatível (" +  vaga.getNivel() + ")");
            }

            if (usuarioSelecionado.getBuscaInclusao()){
                if (!vaga.isVagaInclusiva()){
                    continue;
                }
                    motivos.add("Inclusiva");
            }

            if (!motivos.isEmpty()){
                System.out.println("Vaga encontrada!");
                System.out.println("Vaga: " + vaga.getTitulo());
                System.out.println("Empresa: " + vaga.getEmpresa());
                System.out.println("Motivos de compatibilidade: ");

                for (String motivo : motivos) {
                    System.out.println("- " + motivo);
                }

                System.out.println("---------------------------");
            }
            else {
                System.out.println("Nenhuma vaga compatível para esse usuário!");
            }
        }
        // Estrutura de repetição que buscará a compatibilidade de vagas com o perfil do usuário, para cada vaga
        // existente na memória do sistema ele repetirá a ação até achar uma vaga ideal para fazer o match
    }
}
