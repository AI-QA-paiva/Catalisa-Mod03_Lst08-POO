package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Prato {

    String nome, ingredientes;

    Scanner digaPrato = new Scanner(System.in);

    ArrayList <Prato> listaPratos = new ArrayList<>();


    public Prato(String nome, String ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }


    public void adicionarPrato(){


    }

    public void exibirPratos(){


    }

    public void excluirPrato(){


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


}
