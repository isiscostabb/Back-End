
// Exercício 04: Buscador de Músicas

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MusicCloud spotify = new MusicCloud();

        // Cadastrando as músicas
        spotify.adicionarMusica("Hope", "Foo Fighters");
        spotify.adicionarMusica("Pra sempre", "Hero");
        spotify.adicionarMusica("Bota na pipoquinha", "MC Pipoquinha");

        // Scanner para leitura do input do usuário
        Scanner scanner = new Scanner(System.in);
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            // Pedindo o nome de uma música para o usuário
            System.out.println("Digite o nome de uma música: ");
            String termo = scanner.nextLine();

            // Buscando a música pesquisada
            try {
                Musica musicaPesquisada = spotify.buscarMusica(termo);
                // Imprime a música que foi encontrada
                System.out.println(musicaPesquisada.getNome() + " - " + musicaPesquisada.getArtista());
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }

            // Pergunta se o usuário deseja continuar
            System.out.println("Deseja continuar? [S/N] ");
            resposta = scanner.nextLine();
        }
        scanner.close();
    }
}

