import entities.Menu;
import entities.Repositorio;
import service.*;
import java.util.Scanner;

void main() {
    Repositorio repositorio = new Repositorio();
    // Repositorio será usado como uma "memória do sistema"

    Scanner scanner = new Scanner(System.in);

    cadastroService CadastroService = new cadastroService(repositorio, scanner);
    listaService ListaService = new listaService(repositorio, scanner);
    matchService MatchService = new matchService(repositorio, scanner);
    // Services

    Menu menu = new Menu(scanner);
    // Menu diretamente ligado as services

    menu.exibirMenu();
    // Exbição do menu
    }