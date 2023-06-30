import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        System.out.println("Bem-vindo a Hamburgueria Jaconero! Estes são nossos produtos:");
        cardapio.exibirProdutos();

        Pedido pedido = new Pedido();
        boolean continuarComprando = true;

        try (Scanner input = new Scanner(System.in)) {
            while (continuarComprando) {
                System.out.print("Digite o número do produto que deseja adicionar ao pedido (ou 0 para finalizar): ");
                int escolha = input.nextInt();
                if (escolha == 0) {
                    continuarComprando = false;
                } else {
                    Produto produto = cardapio.getProduto(escolha);
                    if (produto == null) {
                        System.out.println("Opção inválida. Tente novamente.");
                    } else {
                        System.out.printf("Digite a quantidade de %s que deseja adicionar: ", produto.getNome());
                        int quantidade = input.nextInt();
                        pedido.adicionarItem(new ItemPedido(produto, quantidade));
                    }
                }
            }
        }

        System.out.println("Pedido:");
        pedido.exibirPedido();

        System.out.printf("Total a ser pago: R$ %.2f\n", pedido.calcularTotal());
        System.out.println("Obrigado pela preferência!");
    }
}