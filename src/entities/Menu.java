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
                case 2 -> cadastroService.cadastrarVaga();
                case 3 -> listaService.listarEmpresas();
                case 4 -> listarVagas();

                default -> System.out.println("Insira uma opção válida!");
            }
        }
    }
    // Menu de funções do sistema com escolhas por opções

    public void listarVagas(){
        System.out.println("=== Lista de Vagas ===");
        repositorio.listarVagas();
    }
}
