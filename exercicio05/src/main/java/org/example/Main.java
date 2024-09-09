
//Exercício 05: Compartilhar Postagem

package org.example;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Tipo (texto, imagem, video): ");
        String tipo = scanner.nextLine();

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        MyBook myBook = new MyBook();
        Fotogram fotogram = new Fotogram();
        AnyTube anyTube = new AnyTube();

        // Compartilhando
        if (tipo.equals("texto"))  {
            myBook.compartilharPostagem(postagem);
            fotogram.compartilharPostagem(postagem);
            anyTube.compartilharPostagem(postagem);
        } else if (tipo.equals("imagem"))  {
            myBook.compartilharImagem(postagem);
            fotogram.compartilharImagem(postagem);
            anyTube.compartilharImagem(postagem);
        } else if (tipo.equals("vídeo"))  {
            myBook.compartilharVideo(postagem);
            fotogram.compartilharVideo(postagem);
            anyTube.compartilharVideo(postagem);
        }
    }
}