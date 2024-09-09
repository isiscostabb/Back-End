
//Exercício 06: Ticket do Cinema

package org.example;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        // Adicionando filmes
        cinema.adicionarFilme(new Filme("Filme A", 30, 10));
        cinema.adicionarFilme(new Filme("Filme B", 25, 18));
        cinema.adicionarFilme(new Filme("Filme C", 30, 14));
        cinema.adicionarFilme(new Filme("Filme D", 35, 14));
        cinema.adicionarFilme(new Filme("Filme E", 25, 18));

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Loop
        while (true) {

            System.out.print("Que filme você deseja assistir? ");
            String filmeNome = scanner.nextLine();

            Filme filmeEscolhido = cinema.buscarFilmePorNome(filmeNome);
            if (filmeEscolhido == null) {
                System.out.println("Filme indisponível, tente escolher outro.");
                continue;
            }

            System.out.print("Qual assento você deseja? ");
            String assentoEscolhido = scanner.nextLine();

            if (!cinema.getAssentosDisponiveis().contains(assentoEscolhido)) {
                System.out.println("Assento indisponível, tente escolher outro.");
                continue;
            }

            System.out.print("Qual o seu nome? ");
            String nome = scanner.nextLine();

            System.out.print("Qual sua idade? ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer


            Cliente cliente = new Cliente(nome, idade); //classe cliente
            Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assentoEscolhido); //classe ingresso

            //caso o assento escolhido já estiver vendido
            try {
                cinema.venderIngresso(ingresso);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            //continuar ou parar o loop
            System.out.print("Deseja escolher outro filme? (sim/não) ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("sim")) {
                break;
            }
        }
        scanner.close();
    }
}
