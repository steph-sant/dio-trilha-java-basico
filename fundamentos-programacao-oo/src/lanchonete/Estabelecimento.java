package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.areaCliente.Cliente;

public class Estabelecimento {
   public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();

    //ações que estabelecimento precisa ter ciência
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionairLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();


    Atendente atendente = new Atendente();
    atendente.receberPagamento();
    atendente.servindoMesa();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();
    
   }
}
