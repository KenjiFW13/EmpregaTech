package service;
import entities.*;

import java.util.List;
import java.util.Scanner;

public class cadastroService {

    private static Repositorio repositorio;
    private static Scanner scanner;

    public cadastroService(Repositorio repositorio, Scanner scanner) {
        this.repositorio = repositorio;
        this.scanner = scanner;
    }

    public static void cadastrarEmpresa() {
        System.out.println("=== Cadastrar Empresa ===");

        System.out.println("Nome do Empresa: ");
        String nome = scanner.next();

        System.out.println("E-mail da Empresa: ");
        String email = scanner.next();

        System.out.println("Setor da Empresa: ");
        String setor = scanner.next();

        System.out.println("A empresa possui políticas ativas de inclusão e diversidade?\n" +
                "1 - Sim\n" +
                "2 - Não\n");
        int opcao = scanner.nextInt();
        boolean compromissoInclusao = (opcao == 1);

        int idEmpresa = repositorio.getTotalEmpresas() + 1;
        // Gerador de IDs para empresas, feito a partir do método que puxa o tamanho da lista Empresas.

        Empresa empresa = new Empresa(
                idEmpresa,
                nome,
                email,
                setor,
                compromissoInclusao
        );
        // Objeto empresa

        repositorio.adicionarEmpresa(empresa);
        // Adiciona empresa ao repositório

        System.out.println("Empresa adicionada com sucesso!");
    }
    // Método de cadastrar Empresas ao sistema, recebe como parâmetro a classe empresa


    public static void cadastrarVaga() {
        List<Empresa> listaEmpresas = repositorio.empresas;

        if (listaEmpresas.isEmpty()){
            System.out.println("Não há empresas para cadastrar a vaga!");
            return;
        }
        // Caso de erro, se não houver empresas para cadastrar uma vaga

        System.out.println("=== Cadastrar Vaga ===");

        System.out.println("Título da Vaga: ");
        String titulo = scanner.next();

        System.out.println("Área: ");
        String area = scanner.next();

        System.out.println("Tipo de contrato: ");
        String tipo = scanner.next();

        System.out.println("Nível desejado para essa vaga: ");
        String nivel = scanner.next();

        System.out.println("Vaga Inclusiva: \n" +
                "1 - Sim\n" +
                "2 - Não\n");
        int opcaoInclusao = scanner.nextInt();
        boolean vagaInclusiva = (opcaoInclusao == 1);

        System.out.println("Escolha a empresa para ter a vaga cadastrada: ");

        for (int i = 0; i < listaEmpresas.size(); i++) {
            Empresa empresa = listaEmpresas.get(i);
            System.out.println((i + 1) + " - " + empresa.getNome());
        }

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao < 1 || opcao > listaEmpresas.size()) {
            System.out.println("Opção inválida!");
            return;
        }
        // Caso de erro para opção inválida

        Empresa empresaSelecionada = listaEmpresas.get(opcao - 1);

        System.out.println("Empresa selecionada: " +  empresaSelecionada.getNome());
        // Selecionador de empresa para cadastrar vaga por número/opção

        int IDVaga = repositorio.vagas.size() + 1;
        // Gerador de Ids automático para vagas

        Vaga vaga = new Vaga(
                IDVaga,
                titulo,
                area,
                tipo,
                nivel,
                vagaInclusiva,
                empresaSelecionada
        );
        // Objeto Vaga

        repositorio.adicionarVaga(vaga);
        // Adiciona vaga ao repositório

        empresaSelecionada.adicionarVaga(vaga);
        // Adiciona vaga à empresa

        System.out.println("Vaga adicionada com sucesso!");
    }
    // Método de cadastrar vagas ao sistema e às empresas


}
