package SistemaDeMusica;

public class CDPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Reproduzindo CD...");
    }

    @Override
    public void stop() {
        System.out.println("Parando CD...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando CD...");
    }

    @Override
    public void reverse() {
        System.out.println("Retrocedendo CD...");
    }
}
