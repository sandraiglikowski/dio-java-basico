import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("BEM VINDO!");
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Agora insira o número da conta: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, insira seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Para finalizar, insira seu saldo (Exemplo: 123.45)");
        saldo = scanner.nextDouble();

        System.out.println("Olá "
                + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta "
                + numero + " e seu saldo "
                + saldo + " já está disponível para saque.");
    }
}
