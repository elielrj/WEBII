package WEB2.prova.q1;

public class Item {

	private int quantidade;
	private Produto produto;


	public Item(int quantidade, Produto produto){
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade(){
		return this.quantidade;
	}

	public Produto getProduto(){
		return this.produto;
	}

	public double calcularSubTotal(){
		return this.quantidade * this.produto.getValor();
	}

	public String imprimirItem(){
		return "Nome: " + this.produto.getNome() + " - Valor Un: " + this.produto.getValor() + " - Qtd: " + this.getQuantidade() + " - Sub-Total: " + this.calcularSubTotal() + "\n";
	}


}
