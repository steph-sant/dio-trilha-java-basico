package estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.digitalizadora.Scanner;
import Equipamentos.impressora.DeskJet;
import Equipamentos.impressora.Impressora;
import Equipamentos.impressora.LaserJet;
import Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
   public static void main(String[] args) {
  EquipamentoMultifuncional em = new EquipamentoMultifuncional();
  
  Scanner scanner = new Scanner();
  LaserJet laserJet = new LaserJet();

  Impressora impressora = laserJet; //em
  Digitalizadora digitalizadora = scanner; //em
  Copiadora copiadora = em;

  impressora.imprimir();
  digitalizadora.digitalizar();
  copiadora.copiar();
   }
}
/*
 * EXEMPLOS DO USO DE INTERFACES
 */