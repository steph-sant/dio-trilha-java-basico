public class ExemploBreakContinue {
   public static void main(String[] args) {
    for(int numero = 1; numero <=5; numero++){
        if(numero == 3)
        continue;
 //o break para a execução, continue exclui o numero escolhido e segue o comando normal

        System.out.println(numero);
    }
   }
}
