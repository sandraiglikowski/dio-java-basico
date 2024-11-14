import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário: ");
        float valorSalario = scanner.nextFloat();

        System.out.print("Benefício: ");
        float valorBeneficio = scanner.nextFloat();
        float valorImposto = 0;

        if (valorImposto >= 0 && valorSalario <= 1100) {
            // aliquota de 5% mediante o salario
            valorImposto = 0.05f * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10f * valorSalario;
        } else {
            valorImposto = 0.15f * valorSalario;
        }

        // calcula e imprime
        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));
    }
}
