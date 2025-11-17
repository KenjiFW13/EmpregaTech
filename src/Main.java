import entities.Menu;
import entities.Repositorio;

void main() {
    Repositorio repositorio = new Repositorio();
    // Repositorio será usado como uma "memória do sistema"

    Menu menu = new Menu(repositorio);

    menu.exibirMenu();
    }