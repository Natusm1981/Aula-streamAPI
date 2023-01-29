import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("pegue os 5 primeiros numeros e coloque dentro de um SET");

        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        //um SET não aceita numeros repetidos

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros.");
        List<Integer> minhaLista = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
                //.forEach(System.out::println);
        System.out.println(minhaLista);

        System.out.println("Pegue os numeros pares maiores que 2 e coloqeu em uma lista");

        List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listaParesMaioresQue2);

        System.out.println("Mostre a média dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares");

        List<Integer> pares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0))
                .collect(Collectors.toList());
        System.out.println(pares);

        System.out.println("--------------");
        System.out.println("Retirando os numeros repetidos, quantos elementos ficam?");

       Set<String> distintos = new HashSet<>(numerosAleatorios);
        System.out.println(distintos.size());



        }


    }
