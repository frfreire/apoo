package br.unicesumar.financas;

public class ContaCorrente extends ContaBancaria implements IConta{


    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-valor);
    }
}
