package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompra {

	private List<Item> Carrinho;
	
	public CarrinhoDeCompra() {
		this.Carrinho = new ArrayList<>();
	}
	

	public void adicionariItem(String nome, int quantidade, double preco) {
		boolean itemExiste = false;
		//verifica se o carrinho está vazio
		if(!Carrinho.isEmpty()) {
			for(Item i : Carrinho) {
				// veririca se o item já consta no carrinho e atualiza a quantidade
				if(i.getNome().equalsIgnoreCase(nome)) {
					System.out.println(nome.toUpperCase() + " já existe no carrinho. Foi adicionado " + quantidade + "ao carrinho");
					// adiciona a quantidade ao item que já existe na lista
					int quantidadeAtual = i.getQuantidade();
					quantidadeAtual += quantidade;
					i.setQuantidade(quantidadeAtual);
					itemExiste = true;
					break;
					}					
				}
			}
		
		if (!itemExiste) {
			Carrinho.add(new Item(nome, quantidade, preco));
	}	
}

	
public void removerItem(String nome) {
	if(!Carrinho.isEmpty()) {
		for(Item i : Carrinho) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				int index = Carrinho.indexOf(i);
				Carrinho.remove(index);
				System.out.println("O item " + nome + "foi removido com sucesso!");
			}
		}
	} else {
		System.out.println("O item não existe ou não foi encontrado na lista!");
	}
}

public void calcularValorTotal() {
	double valorTotal = 0;
	if(!Carrinho.isEmpty()) {
		for (int i=0; i < Carrinho.size(); i++ ) {
			
		}
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
