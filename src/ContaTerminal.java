import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nome;
        double saldo = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = s.nextLine();
        System.out.println("Digite o numero da agencia da sua conta (com digito separado por hifen \"-\"):");
        agencia = s.nextLine();
        System.out.println("Digite o numero da sua conta:");
        numero = s.nextInt();
        System.out.println("Digite o seu saldo em reais (somente numeros):");
        saldo = s.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nome, agencia, numero, saldo);

        s.close();
    }
}
