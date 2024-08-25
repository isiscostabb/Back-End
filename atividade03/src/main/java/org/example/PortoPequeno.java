
package org.example;

public class PortoPequeno extends BasePorto {

    public PortoPequeno(String nomePorto) {
        super(nomePorto);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.tamanho <= 10) {
            atracados.add(barco);
            System.out.println("O " + barco.nome + " foi atracado no " + nomePorto + ".");
            return true;
        } else {
            System.out.println("O " + barco.nome + " é muito grande, tente atracar em outro porto.");
            return false;
        }
    }
}



