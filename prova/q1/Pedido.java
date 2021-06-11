package WEB2.prova.q1;

import java.util.ArrayList;

public class Pedido {

	private int numero;
	private ArrayList<Item> itens;

	public Pedido(Item item, int numero){
		this.itens = new ArrayList<>();
		itens.add(item);
		this.numero = numero;
	}

	public void addItem(Item item){

			itens.add(item);

	}

	public double calcularTotal(){
		double total = 0;
		for(Item item: itens){
			total += item.calcularSubTotal();
		}
		return total;
	}

	public int getNumero(){
		return this.numero;
	}

	public String imprimirPedido(){
		String s =  "Pedido Nr: " + this.getNumero() + "\n";
		for(Item item: itens){
			s += item.imprimirItem();
		}
		s += "Total do Pedido: " + this.calcularTotal();
		return s;
	}


}
