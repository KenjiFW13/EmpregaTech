package entities;
import java.util.List;
import java.util.Scanner;
import service.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Repositorio repositorio;
    private cadastroService CadastroService;
    private listaService ListaService;

    public Menu(cadastroService cadastroService, listaService listaService, Scanner scanner, Repositorio repositorio) {
        this.CadastroService = cadastroService;
        this.ListaService = listaService;
        this.scanner = scanner;
        this.repositorio = repositorio;
    }



    public void exibirMenu(){

        while (true) {
            System.out.println("""
                    === MENU EmpregaTech ===
                    1 - Cadastrar Empresa
                    2 - Cadastrar Vaga
                    3 - Listar Empresas
                    4 - Listar Vagas
                    0 - Sair
                    =========================""");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0 -> {return;}
                case 1 -> cadastroService.cadastrarEmpresa();
                case 2 -> cadastrarVaga();
                case 3 -> listarEmpresas();
                case 4 -> listarVagas();

                default -> System.out.println("Insira uma opção válida!");
            }
        }
    }
    // Menu de funções do sistema com escolhas por opções

    public void cadastrarVaga() {
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

    public void listarEmpresas(){
        System.out.println("=== Lista de Empresas ===");
        // Não é necessário fazer um verificador se há ou não empresas aqui, pois já existe um verificador na classe Repositorio
        repositorio.listarEmpresas();
        // Basta chamar o método listarEmpresas pelo Repositorio, pois já está feito
    }

    public void listarVagas(){
        System.out.println("=== Lista de Vagas ===");
        repositorio.listarVagas();
    }
}
