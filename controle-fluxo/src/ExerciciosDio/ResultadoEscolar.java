package ExerciciosDio;
public class ResultadoEscolar {
   public static void main(String[] args) {
    //Condicional Composta e encadeada
    int nota = 6;

    if(nota >=7)
    System.out.println("Aprovado");

    else if (nota >= 5 && nota <7)//true ou false
    System.out.println("Prova de Recuperação");

    else
    System.out.println("Reprovado");
   

    /*  Condição ternaria
    int nota = 6;
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

    System.out.println(resultado);*/

   } 
}
