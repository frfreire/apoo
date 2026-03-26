package br.unicesumar.domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itens;
    private double total;

    public Pedido(){
        this.itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
