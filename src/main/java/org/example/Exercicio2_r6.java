package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio2_r6 {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(11122233344L, "João", 18, "M"));
        pessoas.add(new Pessoa(11155566622L, "Maria", 40, "F"));
        pessoas.add(new Pessoa(11133322215L, "José", 25, "M"));
        pessoas.add(new Pessoa(22244422216L, "Ana", 75, "F"));

        pessoas.sort(Comparator.comparing(Pessoa::getNome).thenComparing(Pessoa::getIdade));

        Map<Integer, List<Pessoa>> pessoasPorIdade = pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getIdade));

        pessoasPorIdade.forEach((idade, listaPessoas) -> {
            System.out.println("Idade: " + idade);
                listaPessoas.forEach(pessoa -> {
                    System.out.println(
                            "Nome: " + pessoa.getNome() +
                                    ", CPF: " + pessoa.getCpf());
                }); 
        });
    }
}