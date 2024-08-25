
package org.example;

public class Personagem {
    public String nome;
    public int vida;
    public int ataque;

    // dados personagem
    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    // manipulação vida
    public void receberDano(int dano) {
        this.vida -= dano;

        if (vida <= 0) {
            System.out.println(this.nome + " foi derrotado!");
        }
    }

    // manipulação dano
    public void atacar(Personagem alvo) {

        if (alvo.vida <= 0) {
            System.out.println("Ataque cancelado, o " + alvo.nome + " já foi de derrotado");
        } else {
            alvo.receberDano(this.ataque);
        }
    }
}