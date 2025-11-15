package entities;

public class Menu {

    private Repositorio repositorio;

    public Menu(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void exibirMenu(){
        while (true) {
            System.out.println("""
                    === MENU EmpregaTech ===""");
        }
    }
}
