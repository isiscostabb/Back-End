
//Exercício 01: Recomendador de Filmes

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("1. Sci-fi");
        System.out.println("2. Medieval");
        System.out.println("Que ambientação você prefere? ");
        String primeiraResposta = leitor.nextLine();

        System.out.println("1. Comédia");
        System.out.println("2. Drama");
        System.out.println("Que gênero você prefere? ");
        String segundaResposta = leitor.nextLine();

        if (primeiraResposta.equals("1") && segundaResposta.equals("1")) {
            System.out.println("Sugestão: Homens de Preto");
        } else if (primeiraResposta.equals("1") && segundaResposta.equals("2")) {
            System.out.println("Sugestão: Arrival");
        } else if (primeiraResposta.equals("2") && segundaResposta.equals("1")) {
            System.out.println("Sugestão: Shrek");
        } else if (primeiraResposta.equals("2") && segundaResposta.equals("2")) {
            System.out.println("Sugestão: Gladiador");
        } else {
            System.out.println("Responda corretamente novamente");
        }
    }
}
