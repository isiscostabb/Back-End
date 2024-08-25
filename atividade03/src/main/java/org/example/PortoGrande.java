
package org.example;

public class PortoGrande extends BasePorto {

    public PortoGrande(String nomePorto) {
        super(nomePorto);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.tamanho >= 10) {
            atracados.add(barco);
            System.out.println("O " + barco.nome + " foi atracado no " + nomePorto + ".");
            return true;
        } else {
            System.out.println("O " + barco.nome + " é muito pequeno, tente atracar em outro porto.");
            return false;
        }
    }
}
