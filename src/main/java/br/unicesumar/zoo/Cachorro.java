package br.unicesumar.zoo;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Au au");
    }

    public void passear(){
        System.out.println("Saída para o xixi");
    }

    public void passear(String local){
        System.out.println("Saída para o " + local);
    }

    public void passear(String local, String tutor){
        System.out.println("Saída para o " + local + " com o " + tutor);
    }
}
