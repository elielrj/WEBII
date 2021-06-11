package WEB2.prova.q1;

public class CalcularDesconto implements Desconto{

	private Pedido pedido;
	private Desconto desconto;

	public CalcularDesconto(Pedido pedido, Desconto desconto) {
		this.pedido = pedido;
		this.desconto = desconto;
	}

	public double calcularDesconto() {

		return this.calcula(this.pedido);


	}


	@Override
	public double calcula(Pedido pedido) {
		return desconto.calcula(pedido);
	}
}
