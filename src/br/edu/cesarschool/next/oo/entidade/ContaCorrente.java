//  Esta classe representará a entidade ContaCorrente e ContaPoupanca, e conterá informações básicas 
//  numero (da conta), saldo e nomeCorrentista.

package br.edu.cesarschool.next.oo.entidade;

import java.io.Serializable;

public class ContaCorrente implements Serializable{
   // Atribuos da classe:
   private static final long serialVersionUID = 1L;
   private String numero;
   private double saldo;
   private String nomeCorrentista;

   // Construtores da classe:
   public ContaCorrente() {

   }

   public ContaCorrente(String numero, double saldo, String nomeCorrentista) {
      this.numero = numero;
      this.saldo = saldo;
      this.nomeCorrentista = nomeCorrentista;
   }

   // Métodos Set/Get da classe:
   public void setNumero(String numero) {
      this.numero = numero;
   }

   public void setNomeCorrentista(String nomeCorrentista) {
      this.nomeCorrentista = nomeCorrentista;
   }

   public static long getSerialversionuid() {
      return serialVersionUID;
   }

   public String getNumero() {
      return numero;
   }

   public double getSaldo() {
      return saldo;
   }

   public String getNomeCorrentista() {
      return nomeCorrentista;
   }
   // Outros métodos dessa classe:

   public void creditar(double valor) {
      saldo += valor; // saldo recebe o valor que já tinha (+=) + novo valor
   }

   public void debitar(double valor) {
      saldo -= valor; // saldo recebe o valor que já tinha (+=) - novo valor
   }
}
