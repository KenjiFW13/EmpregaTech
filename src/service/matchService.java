package service;
import entities.*;
import java.util.Scanner;

public class matchService {
    private static Repositorio repositorio;
    private static Scanner scanner;

    public void buscarVagas(Repositorio repositorio, Scanner scanner){
        this.repositorio = repositorio;
        this.scanner = scanner;
    }
}
