
import java.util.Scanner;

public class contaTerminal{
    public static void main(String[] args) throws Exception {

        System.out.println("seja bem vindo ao seu banco digital\n");


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o numero da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia");
        int agencia = scanner.nextInt();


        System.out.println("Digite seu nome completo");

        String  nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o valor de deposito");
        double saldo = scanner.nextDouble();

        System.out.println("Parabens\n");

        System.out.println("você acabou de cria sua conta em nosso banco\n");

        System.out.println("ola " +nomeCliente+  ", obrigado por criar uma conta em nosso banco, sua agência e "+agencia+",");
        System.out.println("e sua conta e " + numero+ ", e seu saldo e R$="+saldo +", e ja esta disponivel para saque.");









    }







}
