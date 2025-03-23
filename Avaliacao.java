// Classe Avaliacao
public class Avaliacao {
    private Produto produto;
    private Cliente cliente;
    private int avaliacao;
    private String comentario;

    public Avaliacao(Produto produto, Cliente cliente, int avaliacao, String comentario) {
        this.produto = produto;
        this.cliente = cliente;
        this.avaliacao = avaliacao;
        this.comentario = comentario;
    }

    // Getters e Setters
    
    public Produto getProduto(){
        return this.produto;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public int getAvaliacao(){
        return this.avaliacao;
    }
    
    public String getComentario(){
        return this.comentario;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }
    
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    
    public String toString(){
        return "\nAvaliação: " +this.produto+ " | " +this.avaliacao+ " | " +this.comentario;
    }
    
    public boolean isAvaliacaoPositiva() {
        // Defina um limite para considerar a avaliação como positiva
        int limitePositivo = 3; // Avaliações maiores ou iguais a 3 são consideradas positivas

        return avaliacao >= limitePositivo;
    }
}

