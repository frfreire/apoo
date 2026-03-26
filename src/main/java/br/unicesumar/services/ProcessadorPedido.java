package br.unicesumar.services;

import br.unicesumar.domain.Pedido;

public class ProcessadorPedido {

    public void processar(Pedido pedido){
        validar(pedido);
        calcularPedido(pedido);
        salvar(pedido);
    }

    private void validar(Pedido pedido){
        if(pedido == null || pedido.getItens().isEmpty()){
            throw new IllegalArgumentException("Pedido vazio ou inexistente");
        }
    }

    private void calcularPedido(Pedido pedido){
        double soma = pedido.getItens().stream()
                .mapToDouble(item -> item.getPreco())
                .sum();
        if(soma < 0){
            throw new IllegalArgumentException("Valor invalido");
        }

        pedido.setTotal(soma);
    }

    private void salvar(Pedido pedido){
        System.out.println("Salvo com sucesso");
    }

}
