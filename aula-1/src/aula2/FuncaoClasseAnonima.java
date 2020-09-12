package aula2;

public class FuncaoClasseAnonima {

    public static void main(String[] args) {

        Funcao colocarPrefixoSenhorNaString = valor -> "Sr " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));

    }

}
