/**
 *
 * @author Guilherme Azevedo
 */
public class Rodada {
    
    private int numrodada;
    private Jogador jogador;
    private Lance lance;

    public Rodada(int numrodada, Jogador jogador, Lance lance) {
        this.numrodada = numrodada;
        this.jogador = jogador;
        this.lance = lance;
    }

    public int getNumrodada() {
        return numrodada;
    }

    public void setNumrodada(int numrodada) {
        this.numrodada = numrodada;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Lance getLance() {
        return lance;
    }

    public void setLance(Lance lance) {
        this.lance = lance;
    }

}
