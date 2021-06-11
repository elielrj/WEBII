package WEB2.prova.q1;

public class Teste {
    public static void main(String[] args) {

        Item item1 = new Item(10, new Produto("Refrigerante", 8));
        Item item2 = new Item(10, new Produto("Leite", 5));
        Item item3 = new Item(10, new Produto("Biscoito", 4));
        Item item4 = new Item(10, new Produto("Açúcar", 6));

        Item item5 = new Item(10, new Produto("Bolo", 50));
        Item item6 = new Item(10, new Produto("Carne", 20));
        Item item7 = new Item(10, new Produto("Ovos", 15));


        Pedido pedido = new Pedido(item1, 1);
        pedido.addItem(item2);
        pedido.addItem(item3);
        pedido.addItem(item4);

        Pedido pedido2 = new Pedido(item5, 2);
        pedido2.addItem(item6);
        pedido2.addItem(item7);

        CalcularDesconto calculaDesconto = new CalcularDesconto(pedido, new PromocaoDeNatal());

        CalcularDesconto calculaDesconto2 = new CalcularDesconto(pedido2, new BlackFriday());


        System.out.println(pedido.imprimirPedido());
        System.out.println("Desconto: " + calculaDesconto.calcularDesconto());
        System.out.println("Total com desconto: " + (pedido.calcularTotal() - calculaDesconto.calcularDesconto()) + "\n");

        System.out.println(pedido2.imprimirPedido());
        System.out.println("Desconto 2: " + calculaDesconto2.calcularDesconto());
        System.out.println("Total com desconto: " + (pedido2.calcularTotal() - calculaDesconto2.calcularDesconto()));

    }
}
