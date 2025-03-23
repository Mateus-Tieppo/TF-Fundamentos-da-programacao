// Classe Categoria
import java.util.Comparator;
public class Categoria {
    private int id;
    private String nome;

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters
    public int getID (){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String toString(){
        return "\nCategoria: " +this.id+ " | " +this.nome;
    }
    
    public boolean contemPalavraChave(String palavraChave) {
        // Converte ambos para minúsculo para fazer uma comparação case insensitive
        String nomeLowerCase = nome.toLowerCase();
        String palavraChaveLowerCase = palavraChave.toLowerCase();

        // Verifica se o nome da categoria contém a palavra-chave
        return nomeLowerCase.contains(palavraChaveLowerCase);
    }
}