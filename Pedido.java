// Classe Pedido
public class Pedido {
    private int id;
    private Cliente cliente;
    private ItemPedido[] itens;
    private String status;

    public Pedido(int id, Cliente cliente, String status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
        this.itens = new ItemPedido[10];
    }

    // Getters e Setters

    public int getID(){
        return this.id;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public ItemPedido[] getItens(){
        return this.itens;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setItens(ItemPedido[] itens){
        this.itens = itens;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String toString(){
        return "\nPedido: "+this.id+ " | " +this.cliente+ " | " +this.itens+ " | " +this.status;
    }
    
    public void adicionarItem(ItemPedido item) {
        // Verifica se há espaço no array
        int itemCount = percorrerArray();
        if (itemCount >= itens.length) {
            // Se não houver espaço, expande o array
            expandirArray();
        }
        // Adiciona o item ao array e incrementa o contador
        itens[itemCount] = item;
    }

    private int percorrerArray() {
        int itemCount = 0;
        // Percorre o array 'itens' e conta quantos elementos não são nulos
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] != null) {
                itemCount++;
            }
        }
        return itemCount;
    }  

    private void expandirArray() {
        // Cria um novo array com o dobro do tamanho
        ItemPedido[] novoArray = new ItemPedido[itens.length * 2];
        // Copia os itens do array antigo para o novo
        for (int i = 0; i < itens.length; i++) {
            novoArray[i] = itens[i];
        }
        // Atribui o novo array ao campo 'itens'
        itens = novoArray;
    }
}