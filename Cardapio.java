class Cardapio {
    private Produto[] produtos;

    public Cardapio() {
        produtos = new Produto[]{
                new Produto("Hamburguer", 25.0),
                new Produto("Batata Frita", 12.0),
                new Produto("Agua", 4.0),
                new Produto("Refrigerante", 6.0)
        };
    }

    public void exibirProdutos() {
        for (int i = 0; i < produtos.length; i++) {
            Produto produto = produtos[i];
            System.out.println((i + 1) + " - " + produto.getNome() + " - R$" + produto.getPreco() + " (unidade)");
        }
    }

    public Produto getProduto(int escolha) {
        if (escolha >= 1 && escolha <= produtos.length) {
            return produtos[escolha - 1];
        }
        return null;
    }
}