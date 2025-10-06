package SistemaDeMusica;


public class Studio {
    private Player player;

    public Studio(Player player) {
        this.player = player;
    }

    public void iniciar() {
        player.play();
    }

    public void parar() {
        player.stop();
    }

    public void pausar() {
        player.pause();
    }

    public void retroceder() {
        player.reverse();
    }

    public void trocarPlayer(Player novoPlayer) {
        this.player = novoPlayer;
        System.out.println("Player alterado com sucesso!");
    }
}
