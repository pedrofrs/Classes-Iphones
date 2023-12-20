package com.apple.aparelho.iphone;

import com.apple.aparelho.funcoes.AparelhoTelefonico;
import com.apple.aparelho.funcoes.NavegadorInternet;
import com.apple.aparelho.funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar(){
        System.out.println("Tocando");
    }
    public void pausar(){
        System.out.println("Musica pausada");
    }
    public void selecionarMusica(){
        System.out.println("Selecionar musica:");
    }

    public void ligar(){
        System.out.println("Ligando");
    }
    public void atender(){
        System.out.println("Atendido");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }

    public void exibirPagina(){
        System.out.println("Selecionar musica:");
    }
    public void adicionarNovaAba(){
        System.out.println("Selecionar musica:");
    }
    public void atualizarPagina(){
        System.out.println("Selecionar musica:");
    }
}
