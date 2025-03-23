public class ItemPedido{
    private Produto produto;
    private int quantidade;
    
    public ItemPedido (Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    // Getters e Setters + toString
    
    public Produto getProduto(){
        return this.produto;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public String toString(){
        return "\nItem Pedido: " +this.produto+ " | " +this.quantidade;
    }
    
    public double calcularValorTotal() {
        double valorTotal = produto.getPreco() * quantidade;
        return valorTotal;
    }
}