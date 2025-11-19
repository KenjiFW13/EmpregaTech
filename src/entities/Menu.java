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
                    2 - Listar Empresas
                    3 - Cadastrar Vaga
                    4 - Listar Vagas
                    5 - Cadastrar Usuário 
                    6 - Listar Usuários
                    7 - Match
                    0 - Sair
                    =========================""");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0 -> {return;}
                case 1 -> cadastroService.cadastrarEmpresa();
                case 2 -> listaService.listarEmpresas();
                case 3 -> cadastroService.cadastrarVaga();
                case 4 -> listaService.listarVagas();
                case 5 -> cadastroService.cadastrarUsuario();
                case 6 -> listaService.listarUsuarios();
                case 7 -> matchService.buscarVagas();
                default -> System.out.println("Insira uma opção válida!");
            }
        }
    }
    // Menu de funções do sistema com escolhas por opções
}
