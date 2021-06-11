package WEB2.prova.q1;

public class BlackFriday implements Desconto {

	private String descricao;

	public BlackFriday() {
		this.descricao = "BlackFriday";

	}

	public double calcula(Pedido pedido) {
		return pedido.calcularTotal() * 0.20;
	}

}
