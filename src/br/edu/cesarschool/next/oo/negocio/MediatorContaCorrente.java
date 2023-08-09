package br.edu.cesarschool.next.oo.negocio;

import br.edu.cesarschool.next.oo.dao.DAOContaCorrente;
import br.edu.cesarschool.next.oo.entidade.ContaCorrente;
import br.edu.cesarschool.next.oo.entidade.ContaPoupanca;



public class MediatorContaCorrente {
   DAOContaCorrente daoContaCorrente = new DAOContaCorrente();

   public MediatorContaCorrente() {
   }

   public MediatorContaCorrente(DAOContaCorrente daoContaCorrente) {
      this.daoContaCorrente = daoContaCorrente;
   }

   public String incluir(ContaCorrente conta){
      if(conta == null){
         return "Conta não encontrada";
      }else if(stringNulaOuVazia(conta.getNumero())){
         return "Número da conta vazio";
      }else if(conta.getNumero().length() < 5 || conta.getNumero().length() > 8){
         return "Número da conta inválido";
      }else if(conta.getSaldo() < 0){
         return "Saldo negativo";
      }else if(stringNulaOuVazia(conta.getNomeCorrentista())){
         return "Nome nulo ou vazio";
      }else if(conta.getNomeCorrentista().length() > 60){
         return "Caracteres excedem o permitido";
      }else if(conta instanceof ContaPoupanca){
         //!...........................................ContaPoupanca
      }
   }


   private boolean stringNulaOuVazia(String dado) {
		return dado == null || dado.trim().equals(""); //
	}
   
}
