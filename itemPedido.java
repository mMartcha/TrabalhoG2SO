class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public void exibirItemPedido() {
        System.out.printf("%s x%d: R$ %.2f\n", produto.getNome(), quantidade, calcularSubtotal());
    }
}
