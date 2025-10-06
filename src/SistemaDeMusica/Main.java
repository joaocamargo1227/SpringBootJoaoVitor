package SistemaDeMusica;

public class Main {
    public static void main(String[] args) {

        // Criando um DVDPlayer e passando para o Studio
        Player dvd = new DVDPlayer();
        Studio studio = new Studio(dvd);

        System.out.println("=== Testando DVDPlayer ===");
        studio.iniciar();
        studio.pausar();
        studio.retroceder();
        studio.parar();

        System.out.println("\n=== Alterando para CDPlayer ===");
        Player cd = new CDPlayer();
        studio.trocarPlayer(cd);

        studio.iniciar();
        studio.pausar();
        studio.retroceder();
        studio.parar();
    }
}
