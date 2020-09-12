package aula2;

import java.util.Arrays;

public class ComposicaodeFuncoes {

    public static void main(String[] args) {

        int[] valores = {1, 2, 3, 4};
        /*transforma o vetor em array*/
        /*valida se o numero é divisivel por 2 e zero se
        * for imprimi*/
        Arrays.stream(valores).filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));
    }
}
