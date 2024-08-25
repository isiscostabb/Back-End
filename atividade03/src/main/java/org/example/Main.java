
//Exercício 03: Barcos e Portos

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Barcos
        Barco barco1 = new Barco("Barco1", 2);
        Barco barco2 = new Barco("Barco2", 5);
        Barco barco3 = new Barco("Barco3", 7);
        Barco barco4 = new Barco("Barco4", 12);
        Barco barco5 = new Barco("Barco5", 20);

        // Lista de barcos
        List<Barco> listaBarcos = new ArrayList<>();
        listaBarcos.add(barco1);
        listaBarcos.add(barco2);
        listaBarcos.add(barco3);
        listaBarcos.add(barco4);
        listaBarcos.add(barco5);

        // Criar porto pequeno
        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        // Atracar barcos
        for (Barco barco : listaBarcos) {
            Boolean resposta = portoPequeno.atracarBarco(barco);
            if (resposta != true) { 
                portoGrande.atracarBarco(barco);
            }
        }
    }
}
