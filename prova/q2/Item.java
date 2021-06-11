package WEB2.prova.q2;

public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String imprimirItemDeEstoque() {
        return produto.imprimirProdutoDeEstoque() + " Qtd: " + this.getQuantidade();
    }
    public String imprimirItemDeCompra() {
        return produto.imprimirProdutoDeCompra() + " Qtd: " + this.getQuantidade() + " SubTotal: " + this.getQuantidade() * produto.getValor();
    }

    public float subTotal() {
        return produto.getValor() * this.getQuantidade();
    }
}
