package WEB2.prova.q2;

import java.util.ArrayList;

public class Supermercado {

    private ArrayList<Produto> produtos;
    private ArrayList<Compra> compras;

    public Supermercado() {
        this.produtos = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public ArrayList<Produto> getEstoque(){
        return produtos;
    }

    public void addProduto(String nome, int qtdEstoque, float valor){
        Produto novoProduto = new Produto(this.proximoCodigoDeProduto(), nome, qtdEstoque, valor);
        produtos.add(novoProduto);
    }

    public int proximoCodigoDeProduto(){
        return produtos.size() + 1;
    }

    public int proximoCodigoDaCompra(){
        return compras.size() + 1;
    }

    public String imprimirEstoque(){
        String estoque = "";

        for(Produto produto:produtos){
            estoque += produto.imprimirProdutoDeEstoque() + "\n";
        }
        return estoque;
    }

    public Produto buscarEstoque(int codProduto){
        for(Produto produto: produtos){
            if(produto.getCodigo() == codProduto){
                return produto;
            }
        }
        return null;
    }

    public void criarNovaCompra(Produto produto, int quantidade){
        try {
            if(this.situaçãoDoEstoque(produto, quantidade)) {
                Compra compra = new Compra(this.proximoCodigoDaCompra());
                compra.addItem(produto, quantidade);
                compras.add(compra);
                this.reduzirQtdEstoque(produto, quantidade);
            }
        }
        catch (Exception e){
            System.out.println("Compra não realizada, sem estoque suficiente!\n");
        }

    }

    public void  addCompraExistente(int numeroDaCompra, Produto produto, int quantidade){
        try {
            if (this.situaçãoDoEstoque(produto, quantidade) == true) {
                for (Compra compra : compras) {
                    if (compra.getNumeroDaCompra() == numeroDaCompra) {
                        compra.addItem(produto, quantidade);
                        this.reduzirQtdEstoque(produto, quantidade);
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Compra não realizada, sem estoque suficiente!\n");
        }
    }

    public void reduzirQtdEstoque(Produto produto, int quantidade){
        for(Produto p: produtos){
            if(p.getNome() == produto.getNome()){
                int novaQtd = p.getQtdEstoque() - quantidade;
                p.setQtdEstoque(novaQtd);
            }
        }
    }
    public String imprimirCompras(){
        String c = "";
        for(Compra compra: compras){
            c += compra.imprimirCompra() + "\n";
        }
        return c;
    }

    public boolean situaçãoDoEstoque(Produto produto, int quantidade){
        if(produto.getQtdEstoque() >= quantidade)
            return true;
        else
            return false;
    }

}
