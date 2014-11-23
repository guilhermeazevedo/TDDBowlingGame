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
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(3, 7)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(6, 1)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(2, 2)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(7, 1)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(10, 0)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(5, 2)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(2, 5)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(4, 3)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(2, 8)));
        jogo.novarodada(new Rodada(jogo.retornanumeroderodadas() + 1, jogador, new Lance(10, 0)));
        
        assertEquals(10, jogo.retornanumeroderodadas(), 0.00001);
    }
    
}
