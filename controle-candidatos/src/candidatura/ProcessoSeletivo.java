package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // System.out.println(" ");
        // selecaoCandidatos();
        // imprimirSelecionados();
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "DANIELA" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    // #2
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;// sinal para inverter
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");

            // em algum momento precisarão sofrer alterações
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ".");
    }


    // Método auxiliar #1
    static boolean atender() {
        return new Random().nextInt(3) == 1;
        // valor entre 1 e 3 significa que atendeu
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "DANIELA" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " - " + candidatos[indice]);
        }
        //
        System.out.println("Forma abreviada de interação com each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            // só posso selecionar 5 enquanto tenho pessoas na minha lista de candidatos
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato
                    + " solicitou este valor de salário R$: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // reusabilidade(aplicar um método antes da aplicação principal)
    static void analisarCandidato(double salarioPretendido) {
        // como parâmetro no momento apenas o salario pretendido
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDADO O RESULTADO DOS DEMAIS RESULTADOS");
        }
    }
}
