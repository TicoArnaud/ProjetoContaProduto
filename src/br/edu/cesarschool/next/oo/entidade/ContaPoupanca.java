//  Esta classe representará a entidade ContaPoupanca, que herda os atributos de ContaCorrente e  
//  conterá, além dos atributos numero (da conta), saldo e nomeCorrentista, herdados da classe mãe, 
//  o atributo percentualBonus.

package br.edu.cesarschool.next.oo.entidade;

public class ContaPoupanca extends ContaCorrente {
   // Atribuos da classe:
   private double percentualBonus; //variavel de escopo local
   private double bonus2;
   // Construtores da classe:
   public ContaPoupanca() {

   }

   public ContaPoupanca(double percentualBonus) {
      this.percentualBonus = percentualBonus;
   }

   public ContaPoupanca(String numero, double saldo, String nomeCorrentista, double percentualBonus) {
      super(numero, saldo, nomeCorrentista);
      this.percentualBonus = percentualBonus;
   }

   // Metodos Get/Set da classe:
   public double getPercentualBonus() {
      return percentualBonus;
   }

   public void setPercentualBonus(double percentualBonus) {
      this.percentualBonus = percentualBonus;
   }

   // Outros métodos dessa classe:

   @Override
   public void creditar(double valor) {
      // saldo += valor * (1 + percentualbonus / 100));
      super.creditar(this.getSaldo() + valor * ((percentualBonus / 100) + 1));
      // O método acima sobrescreve o método creditar da superclasse
   }
   
   
}
