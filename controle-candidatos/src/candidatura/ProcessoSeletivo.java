package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // System.out.println(" ");
        selecaoCandidatos();
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
