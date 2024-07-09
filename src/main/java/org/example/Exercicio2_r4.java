package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio2_r4 {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(11122233344L, "João", 18, "M"));
        pessoas.add(new Pessoa(11155566622L, "Maria", 40, "F"));
        pessoas.add(new Pessoa(11133322215L, "José", 25, "M"));
        pessoas.add(new Pessoa(22244422216L, "Ana", 75, "F"));

        pessoas.sort(Comparator.comparing(Pessoa::getNome).thenComparing(Pessoa::getSexo));

        Map<String, List<Pessoa>> pessoasPorSexo = pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getSexo));

        pessoasPorSexo.forEach((sexo, listaPessoas) -> {
            System.out.println("Sexo: " + sexo);
                listaPessoas.forEach(pessoa -> {
                    System.out.println(
                            "Nome: " + pessoa.getNome() +
                                    ", CPF: " + pessoa.getCpf());
                }); 
        });
    }
}