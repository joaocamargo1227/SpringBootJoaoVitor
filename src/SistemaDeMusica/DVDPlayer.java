package SistemaDeMusica;

public class DVDPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Reproduzindo DVD...");
    }

    @Override
    public void stop() {
        System.out.println("Parando DVD...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando DVD...");
    }

    @Override
    public void reverse() {
        System.out.println("Retrocedendo DVD...");
    }
}
