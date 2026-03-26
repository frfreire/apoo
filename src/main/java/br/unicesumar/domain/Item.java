package br.unicesumar.domain;

public class Item {

    private double preco;

    private Item(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
