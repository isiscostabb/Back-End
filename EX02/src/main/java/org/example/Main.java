
//Exercício 02: Gerador de Personagem

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Personagens
        Personagem jogador = new Personagem("Steve", 100, 20);
        Personagem goblin = new Personagem("Goblin", 50, 5);
        Personagem lobo = new Personagem("Lobo", 75, 15);
        Personagem cavaleiro = new Personagem("Cavaleiro", 200, 20);

        // Lista de inimigos
        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(goblin);
        inimigos.add(lobo);
        inimigos.add(cavaleiro);

        Random random = new Random();
        Personagem inimigo = inimigos.get(random.nextInt(inimigos.size())); // Escolhe um inimigo da lista

        // Loop
        while (jogador.vida > 0 && inimigo.vida > 0) {

            System.out.printf("Vida restante do %s: %d\n", inimigo.nome, inimigo.vida);
            jogador.atacar(inimigo); // Ataca o inimigo

            System.out.printf("Vida restante do %s: %d\n", jogador.nome, jogador.vida);
            inimigo.atacar(jogador); // Ataca o jogador
        }
    }
}