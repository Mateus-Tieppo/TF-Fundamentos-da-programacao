// Classe Cliente
public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private Pedido[] pedidos;

    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.pedidos = new Pedido[10]; // exemplo de array de pedidos com tamanho inicial
    }

    // Getters e Setters

    public int getID(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public Pedido[] getPedidos(){
        return this.pedidos;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setPedidos(Pedido[] pedidos){
        this.pedidos = pedidos;
    }
    
    public String toString(){
        return "\nCliente: " +this.id+ " | " +this.nome+ " | " +this.endereco+ " | " +this.pedidos;
    }
    
    
    public void adicionarPedido(Pedido pedido) {
        // Verifica se o pedido não é nulo
        if (pedido == null) {
            System.out.println("Pedido inválido. Não pode ser adicionado.");
            return;
        }

        // Procura por um espaço vazio no array de pedidos
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] == null) {
                // Encontrou um espaço vazio, adiciona o pedido aqui
                pedidos[i] = pedido;
                System.out.println("Pedido adicionado com sucesso.");
                return;
            }
        }

        // Se chegou aqui, significa que o array está cheio
        System.out.println("Limite de pedidos atingido. Não é possível adicionar mais pedidos.");
    }
}