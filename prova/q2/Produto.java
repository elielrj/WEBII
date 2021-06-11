package WEB2.prova.q2;

public class Produto {
    private int codigo;
    private String nome;
    private int qtdEstoque;
    private float valor;

    public Produto(int codigo, String nome, int qtdEstoque, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String imprimirProdutoDeCompra() {
        return "Cod: " + getCodigo() +" - Nome: " + getNome() + " - Valor: " + getValor();
    }
    public String imprimirProdutoDeEstoque() {
        return "Cod: " + getCodigo() +" - Nome: " + getNome() + " - Estoque: " + getQtdEstoque() + " - Valor: " + getValor();
    }
}
