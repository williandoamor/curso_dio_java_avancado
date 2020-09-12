package aula2;

import java.util.function.UnaryOperator;

public class Imutabilidade {

    public static void main(String[] args) {

        int valor = 20;
        UnaryOperator<Integer> retornaDobro;
        retornaDobro = v -> v * 2;
        System.out.println(retornaDobro.apply(valor));
        System.out.println(valor);
    }
}
