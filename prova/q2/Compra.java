package WEB2.prova.q2;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Item> itens;
    private String metodoDePagamento;
    private int numeroDaCompra;

    public Compra(int numeroDaCompra) {
        this.itens = new ArrayList<>();
        this.numeroDaCompra = numeroDaCompra;
    }

    public int getNumeroDaCompra() {
        return numeroDaCompra;
    }

    public void addItem(Produto produto, int quantidade){
            Item novoItem = new Item(produto, quantidade);
            itens.add(novoItem);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public String imprimirCompra(){
        String s = "Compra Nr: " + this.getNumeroDaCompra() + "\n";
        int total = 0;
        for(Item item: itens){
            s += item.imprimirItemDeCompra() + "\n";
            total += item.subTotal();
        }
        s += "Total da Compra: " + total;
        return s;
    }


}
