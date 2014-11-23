
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Azevedo
 */
public class Jogo {

    private Jogador jogador;
    private List<Rodada> rodadas;
    private int score;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        this.rodadas = new ArrayList<>();
        this.score = 0;
    }

    public int retornanumeroderodadas() {
        return this.rodadas.size();
    }

    public void novarodada(Rodada rodada) {
        if (retornanumeroderodadas() >= 10) {
            System.out.println("O jogador " + this.jogador.getNome() + " ja executou suas 10 rodadas!");
        } else {
            this.rodadas.add(rodada);
            if(retornanumeroderodadas() > 1){
                somascore(rodada.getLance(), this.rodadas.get(retornanumeroderodadas() - 2).isStrike());
            }else{
                somascore(rodada.getLance(), false);
            }
        }
    }
    
    public void somascore(Lance lance, boolean isStrike){
        if(isStrike){
            this.score = this.score + ((lance.getLance1() + lance.getLance2()) * 2);
        }else{
            this.score = this.score + (lance.getLance1() + lance.getLance2());
        }
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public List<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(List<Rodada> rodadas) {
        this.rodadas = rodadas;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
