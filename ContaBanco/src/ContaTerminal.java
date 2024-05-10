import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        
        // Declaração de variáveis para armazenar dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação e leitura de dados do cliente
        System.out.println("** Seja bem-vindo ao Banco DIO! **");
        System.out.println("** Criação de Conta Corrente **");

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Por favor, digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        // Exibição da mensagem final com os dados da conta
        System.out.println("\n** Conta Criada com Sucesso! **");
        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso Banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        System.out.println("\n** Seu Banco DIO, sempre à disposição! **");

        scanner.close(); // Fecha o objeto Scanner

    }
}


