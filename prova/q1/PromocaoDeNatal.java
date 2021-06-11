package WEB2.prova.q1;

public class PromocaoDeNatal implements Desconto {

	private String descricao;


	public PromocaoDeNatal() {
		this.descricao = "Natal";

	}


	@Override
	public double calcula(Pedido pedido) {
		return pedido.calcularTotal() * 0.30;
	}
}
