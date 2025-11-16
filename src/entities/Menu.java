package entities;
import java.util.List;
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

    public void cadastrarVaga(Vaga vaga) {
        List<Empresa> listaEmpresas = repositorio.empresas;

        if (listaEmpresas.isEmpty()){
            System.out.println("Não há empresas para cadastrar a vaga!");
            return;
        }

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

            Empresa empresaSelecionada = listaEmpresas.get(opcao - 1);

            System.out.println("Empresa selecionada: " +  empresaSelecionada.getNome());

            int IDVaga = repositorio.vagas.size() + 1;
            // Gerador de Ids automático para vagas

    }
}
