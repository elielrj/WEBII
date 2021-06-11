package WEB2.prova.q2;

public class Teste {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        supermercado.addProduto("arroz",10, 10);
        supermercado.addProduto("feijão",20, 50);
        supermercado.addProduto("carne",30, 100);

        //estoque
        System.out.println("Estoque 1\n");
        System.out.println(supermercado.imprimirEstoque());

        //Nova compra
        supermercado.criarNovaCompra(supermercado.buscarEstoque(1), 2);

        //impressão de compra
        System.out.println("impressão de compra\n");
        System.out.println(supermercado.imprimirCompras());

        //Estoque
        System.out.println("Estoque 2\n");
        System.out.println(supermercado.imprimirEstoque());

        //adição de itens a compra
        supermercado.addCompraExistente(1, supermercado.buscarEstoque(1), 7);

        //impressão de compra
        System.out.println("impressão de compra\n");
        System.out.println(supermercado.imprimirCompras());

        //estoque
        System.out.println("Estoque 3\n");
        System.out.println(supermercado.imprimirEstoque());

        //adição de mais itens até o limite de estoque
        supermercado.addCompraExistente(1, supermercado.buscarEstoque(1), 1);
        System.out.println("erro?\n");
        supermercado.addCompraExistente(1, supermercado.buscarEstoque(1), 1);
        supermercado.addCompraExistente(1, supermercado.buscarEstoque(2), 10);

        //impressão de compra
        System.out.println("impressão de compra\n");
        System.out.println(supermercado.imprimirCompras());

        //estoque
        System.out.println("Estoque 4\n");
        System.out.println(supermercado.imprimirEstoque());

        ////nova compra 2
        supermercado.criarNovaCompra(supermercado.buscarEstoque(3), 2);

        //impressão de compra 1 e 2
        System.out.println("impressão de compra  2\n");
        System.out.println(supermercado.imprimirCompras());

        //estoque
        System.out.println("Estoque 5\n");
        System.out.println(supermercado.imprimirEstoque());


    }
}
