import java.util.concurrent.ThreadLocaleRandom;

public class ExemploWhile {
    public class void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho.");
            mesada = mesada - valorDoce;//variavel condicional tratada
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Você gastou toda a mesada");
    }

    private static double valorAleatorio(){
        return ThreadLocaleRandom.current().nextDouble(5,10)
    }
}
