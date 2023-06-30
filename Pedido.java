class Pedido {
    private ItemPedido[] itens;
    private int totalItens;

    public Pedido() {
        itens = new ItemPedido[100];
        totalItens = 0;
    }

    public void adicionarItem(ItemPedido item) {
        itens[totalItens] = item;
        totalItens++;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < totalItens; i++) {
            total += itens[i].calcularSubtotal();
        }
        return total;
    }

    public void exibirPedido() {
        for (int i = 0; i < totalItens; i++) {
            itens[i].exibirItemPedido();
        }
    }
}