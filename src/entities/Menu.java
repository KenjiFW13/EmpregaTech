package entities;
import java.util.Scanner;
import service.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public Menu(Scanner scanner) {
        this.scanner = scanner;
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
                case 4 -> listaService.listarVagas();
                default -> System.out.println("Insira uma opção válida!");
            }
        }
    }
    // Menu de funções do sistema com escolhas por opções
}
