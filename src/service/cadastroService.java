package service;
import entities.*;
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


}
