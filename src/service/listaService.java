package service;
import entities.*;
import java.util.Scanner;

public class listaService {

    private static Repositorio repositorio;

    public listaService(Repositorio repositorio, Scanner scanner) {
        this.repositorio = repositorio;
    }

    public static void listarEmpresas(){
        System.out.println("=== Lista de Empresas ===");
        // Não é necessário fazer um verificador se há ou não empresas aqui, pois já existe um verificador na classe Repositorio
        repositorio.listarEmpresas();
        // Basta chamar o método listarEmpresas pelo Repositorio, pois já está feito
    }

    public static void listarVagas(){
        System.out.println("=== Lista de Vagas ===");
        repositorio.listarVagas();
    }
}
