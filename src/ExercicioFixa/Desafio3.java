package ExercicioFixa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> verificanumeroPositivo = n -> n > 0;

        boolean todosPositivos = numeros.stream()
                .allMatch(verificanumeroPositivo);

        if (todosPositivos) {
            System.out.println("Todos os números da lista são positivos.");
        } else {
            System.out.println("Nem todos os números da lista são positivos.");
        }
    }
}
