package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio2_r3 {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(11122233344L, "João", 18, "M"));
        pessoas.add(new Pessoa(11155566622L, "Maria", 40, "F"));
        pessoas.add(new Pessoa(11133322215L, "José", 25, "M"));
        pessoas.add(new Pessoa(22244422216L, "Ana", 75, "F"));

        pessoas.sort(Comparator.comparing(Pessoa::getNome).thenComparing(Pessoa::getSexo));

        pessoas.forEach(pessoa -> {
            System.out.println(
                "Nome: " + pessoa.getNome() +
                ", Sexo: " + pessoa.getSexo() +
                ", CPF: " + pessoa.getCpf());
        });
    }
}