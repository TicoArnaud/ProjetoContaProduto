package br.edu.cesarschool.next.oo.negocio;

import br.edu.cesarschool.next.oo.entidade.Produto;

public class ComparadorProdutoNome {
   @Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
}
