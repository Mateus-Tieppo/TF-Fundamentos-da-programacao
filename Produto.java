import java.util.*;
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;
    private String[] categorias;
    private String[][] avaliacoes; 

    public Produto(int id, String nome, double preco, int estoque, String[] categorias) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categorias = categorias;
        this.avaliacoes = new String[1][2]; 
    }

    // Getters e Setters
    
    public int getID(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getEstoque(){
        return this.estoque;
    }
    
    public String[] getCategorias(){
        return this.categorias;
    }
    
    public String[][] getAvaliacoes(){
        return this.avaliacoes;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    
    public void setCategorias(String[] categorias){
        this.categorias = categorias;
    }
    
    public void setAvaliacoes(String[][] avaliacoes){
        this.avaliacoes = avaliacoes;
    }
    
    public String toString(){
        return "\nProduto: " +this.id+ " | " +this.nome+ " | " +this.preco+ " | " +this.estoque+ " | " +listaCategorias()+ " | " +listaAvaliacoes();
    }
    
    private String listaCategorias(){
        return Arrays.toString(categorias);
    }
    
    private String listaAvaliacoes(){
        return Arrays.deepToString(avaliacoes);
    }
    
    // Métodos adicionais para manipular avaliações
    public void adicionarAvaliacao(Cliente cliente, int estrelas, String comentario) {
        // Encontrar a primeira posição vazia na matriz de avaliações
        for (int l = 0; l < avaliacoes.length; l++) {
            for (int c = 0; c < this.avaliacoes[0].length; c++){
                if (avaliacoes[l][c] == null) {
                    Avaliacao av = new Avaliacao(this, cliente, estrelas, comentario);
                    if (estrelas == 1){
                        String estrelass = "*----";
                        avaliacoes[l][c] = (""+estrelass+" ===> "+comentario);
                    } else if (estrelas == 2){
                        String estrelass = "**---";
                        avaliacoes[l][c] = (""+estrelass+" ===> "+comentario);
                    } else if (estrelas == 3){
                        String estrelass = "***--";
                        avaliacoes[l][c] = (""+estrelass+" ===> "+comentario);
                    } else if (estrelas == 4){
                        String estrelass = "****-";
                        avaliacoes[l][c] = (""+estrelass+" ===> "+comentario);
                    } else if (estrelas == 5){
                        String estrelass = "*****";
                        avaliacoes[l][c] = (""+estrelass+" ===> "+comentario);
                    }
                    return; // Encerra o método após adicionar a avaliação
                }
            }
        }
        System.out.println("Não foi possível adicionar a avaliação: limite de avaliações alcançado.");
    }
}
