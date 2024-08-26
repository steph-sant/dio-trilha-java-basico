import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        String movel = partes[1];
        String fixa = partes[2];
        String bandaLarga = partes[3];
        String tv = partes[4];
        boolean contratado = false;
        
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        scanner.close();
    }
}