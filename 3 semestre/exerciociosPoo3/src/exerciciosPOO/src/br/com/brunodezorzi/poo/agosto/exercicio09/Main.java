package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio09;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Smartphone", 2000.00, 15);
        Produto p3 = new Produto("Headset", 250.00, 30);

        Cliente c1 = new Cliente("Bruno", "bruno9@louco.com", 123456789);

        Venda venda = new Venda(c1);

        venda.adicionarProduto(p1, 1);
        venda.adicionarProduto(p2, 2);
        venda.adicionarProduto(p3, 5);

        venda.mostrarCarrinho();

        venda.finalizarVenda();
    }
}
