package br.unicesumar;

import br.unicesumar.zoo.Animal;
import br.unicesumar.zoo.Cachorro;
import br.unicesumar.zoo.Gato;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<String> exemploLista =  new ArrayList<>();
        exemploLista.add("Java");
        exemploLista.add("Python");
        exemploLista.add("C#");
        exemploLista.add("Java");

//        exemploLista.forEach(n -> System.out.println(n));
        exemploLista.forEach(System.out::println);
//
        for (String exemplo : exemploLista) {
            System.out.println(exemplo);
        }
//        for(int i = 0; i < exemploLista.size(); i++){
//            System.out.println(exemploLista.get(i));
//        }

//        Set<String> exemploSet = new HashSet<>();
//        exemploSet.add("Java");
//        exemploSet.add("Python");
//        exemploSet.add("C#");
//        exemploSet.add("Java");
//
//        Map<String, String> exemploMapa = new HashMap<>();
//        exemploMapa.put("001-abc", "Java");
//        exemploMapa.put("002-abc", "Python");
//        exemploMapa.put("003-abc", "C#");
//
//
//        System.out.println("Exemplo map: " + exemploMapa.get("002-abc"));
//        for(String linguagem: exemploSet){
//            System.out.println(linguagem);
//        }

//        ContaBancaria conta1 = new ContaBancaria();//Heap
//        ContaBancaria conta2 = new ContaBancaria("Joãozinho",9.5,542);//Heap
//
//        conta1.setTitular("Maria");
//        conta1.setSaldo(500);
//
//        System.out.println(conta1.getTitular());
//        System.out.println(conta1.getSaldo());

//        Animal a = new Cachorro();
//        Cachorro c = new Cachorro();
//        Gato g = new Gato();

//        a.emitirSom();
//        c.emitirSom();
//        c.passear();
//        c.passear("Parque da Cidade");
//        c.passear("Parque Olhos d'Água", "Joãozinho");
//        g.emitirSom();

//        IConta conta = new ContaCorrente();
//        conta.depositar(500);
//        conta.sacar(500);
    }
}