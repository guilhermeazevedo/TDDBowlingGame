/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme Azevedo
 * 
 * Erros encontrados: 1
 * 
 */
public class TestesBowlingGame {
    
    @Test
    public void Teste10Rodadas(){
        Jogador jogador = new Jogador("Jogador Forever Alone no Boliche");
        Jogo jogo = new Jogo(jogador);
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 4, 3));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 6, 2));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 2, 2));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 7, 1));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 10, 0));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 4, 1));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 7, 3));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 4, 3));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 9, 0));
        jogo.novarodada(new Rodada(pedro, jogo.getRodadas().size() + 1, 2, 8));
        
        assertEquals(10, jogo.getRodadas().size(), 0.00001);
    }
    
}
