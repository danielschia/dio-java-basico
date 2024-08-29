
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Banco!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");

        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = scanner.next();

        System.out.println("Agora digite o Numero da conta!");
        int NumeroConta = scanner.nextInt();

        System.out.println("Digite seu nome");
        String NomeCliente = scanner.next();

        System.out.println("Insira seu Saldo");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");

    }
}
