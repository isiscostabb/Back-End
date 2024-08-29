
package org.example;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    public String nomePorto;

    public BasePorto(String nomePorto) {
        this.nomePorto = nomePorto;
    }

    // Lista de barcos ATRACADOS
    List<Barco> atracados = new ArrayList<>();


    // Atracar
    public boolean atracarBarco(Barco barco) {
        atracados.add(barco);
        System.out.println("O " + barco.nome + " foi atracado no " + nomePorto + ".");
        return true;
    }

    // Desatracar
    public void desatracarBarco(Barco barco) {
        atracados.remove(barco);
        System.out.println("O " + barco.nome + " foi desatracado do " + nomePorto + ".");
    }
}