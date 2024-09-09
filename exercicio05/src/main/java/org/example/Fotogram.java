package org.example;

public class Fotogram implements PlataformaSocial{

    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Ocorreu um erro ao compartilhar essa postagem no Fotogram.");
    }

    public void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa imagem no Fotogram.");
    }

    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse vídeo no Fotogram.");
    }
}
