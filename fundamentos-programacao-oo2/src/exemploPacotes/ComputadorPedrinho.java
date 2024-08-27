package exemploPacotes;

import exemploPacotes.Apps.FacebookMessenger;
import exemploPacotes.Apps.MSNMessenger;
import exemploPacotes.Apps.ServicoMensagemInstantanea;
import exemploPacotes.Apps.Telegram;

public class ComputadorPedrinho {
   public static void main (String[] args) {
    /*System.out.println("MSN");
    MSNMessenger msn = new MSNMessenger();
    msn.enviarMensagem();
    msn.receberMensagem();

    System.out.println("FACEBOOK");
    FacebookMessenger fcb = new FacebookMessenger();
    fcb.enviarMensagem();
    fcb.receberMensagem();

    System.out.println("TELEGRAM");
    Telegram  tlg = new Telegram();
    tlg.enviarMensagem();
    tlg.receberMensagem(); */
    ServicoMensagemInstantanea smi = null;
    /*
     * NAO SE SABE QUAL APP
     * MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGEM
     */
    String appEscolhido = "tlg";

    if(appEscolhido.equals("msn"))
    smi = new MSNMessenger();
    else if(appEscolhido.equals("fbm"))
    smi = new FacebookMessenger();
    else if(appEscolhido.equals("tlg"));
    smi = new Telegram();

    smi.enviarMensagem();
    smi.receberMensagem();

   }
}
