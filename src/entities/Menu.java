package entities;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Repositorio repositorio;

    public Menu(Repositorio repositorio) {
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
                case 0: return;
                default: System.out.println("Insira uma opção válida!");
            }
        }
    }

    public void cadastrarEmpresa(Empresa empresa) {
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

        repositorio.adicionarEmpresa(empresa);

        System.out.println("Empresa adicionada com sucesso!");
    }
}
