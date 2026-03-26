package br.unicesumar.financas;

public class ContaBancaria {

    private String titular; //Heap
    private double saldo; // Stack
    private int codigoBanco; // Stack

    public ContaBancaria() {

    }

    public ContaBancaria(String titular, double saldo, int codigoBanco) {
        this.titular = titular;
        this.saldo = saldo;
        this.codigoBanco = codigoBanco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
