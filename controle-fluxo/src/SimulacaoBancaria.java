import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean continuar = true;

        while (continuar) {
            /*System.out.println("Escolha uma opção: (apenas números de 0 a 3)");
            System.out.println("1. Depositar"); 
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar programa");*/

            int opcao = scanner.nextInt();
            

            switch (opcao) {
                
                case 1: 
                    // Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor que deseja depositar.");
                    double depositar = scanner.nextDouble();
                    saldo = saldo + depositar;
                    System.out.println("Saldo atual1: " + saldo);
                    break;
                case 2: 
                    //Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor que deseja sacar.");
                    double sacar = scanner.nextDouble();
                    if (saldo >= sacar){
                    saldo = saldo - sacar;
                    System.out.println("Saldo atual2: " + saldo);
                }else 
                    System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    //Exibir o saldo atual da conta.
                    System.out.println("Saldo atual3: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
