import java.util.*;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Produto[] produtos = new Produto[10]; // Array para armazenar produtos
    
    public static void main(String[] args) {
        //Categoria c1 = new Categoria (1, "Eletrônicos");
        //System.out.println("A categoria contém 'eletrônicos'? " + c1.contemPalavraChave("eletrônicos"));
        //System.out.println("A categoria contém 'livros'? " + c1.contemPalavraChave("livros"));
        exibirMenuPrincipal();
    }
    
    private static void exibirMenuPrincipal() {
        boolean sair = false;
        while (!sair) {
            System.out.println("### Sistema Amazon ###");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Avaliar Produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    avaliarProduto();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            System.out.println(); // linha em branco para separar iterações do menu
        }
        System.out.println("Encerrando o programa... Até mais!");
    }

    private static void cadastrarProduto() {
        System.out.print("Digite o ID do produto: ");
        if (!scanner.hasNextInt()) {
            System.out.println("ID inválido! O ID deve ser um número inteiro.");
            scanner.nextLine(); // Consumir a entrada inválida
            return;
        }
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (id <= 0) {
            System.out.println("ID inválido! O ID deve ser um número positivo.");
            return;
        }

        // Expandir array de produtos, se necessário
        if (id > produtos.length) {
            expandirArrayDeProdutos(id);
        }

        // Verificar se o ID já está em uso
        if (produtos[id - 1] != null) {
            System.out.println("ID já utilizado! Por favor, escolha outro ID.");
            return;
        }

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Preço inválido! O preço deve ser um número.");
            scanner.nextLine(); // Consumir a entrada inválida
            return;
        }
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        if (preco <= 0) {
            System.out.println("Preço inválido! O preço deve ser um número positivo.");
            return;
        }

        System.out.print("Digite a quantidade em estoque: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Quantidade em estoque inválida! Deve ser um número inteiro.");
            scanner.nextLine(); // Consumir a entrada inválida
            return;
        }
        int estoque = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (estoque < 0) {
            System.out.println("Quantidade em estoque inválida! Deve ser um número não negativo.");
            return;
        }

        System.out.print("Digite as categorias do produto (separadas por vírgula): ");
        String categoriasInput = scanner.nextLine();
        String[] categorias = categoriasInput.split(",");

        Produto produto = new Produto(id, nome, preco, estoque, categorias);
        produtos[id - 1] = produto;

        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void expandirArrayDeProdutos(int id) {
        int novoTamanho = Math.max(id, produtos.length * 2);
        Produto[] novoArray = new Produto[novoTamanho];
        System.arraycopy(produtos, 0, novoArray, 0, produtos.length);
        produtos = novoArray;
    }

    private static void listarProdutos() {
        System.out.println("### Listagem de Produtos ###");
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto.toString());
                System.out.println("-----------------------------");
            }
        }
    }

    private static void avaliarProduto() {
        
        System.out.println("### Avaliar Produto ###");
        System.out.print("Digite o ID do produto que deseja avaliar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (id <= 0 || id > produtos.length || produtos[id - 1] == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        Produto produto = produtos[id - 1];

        System.out.print("Digite sua avaliação (de 1 a 5 estrelas): ");
        int estrelas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite seu comentário: ");
        String comentario = scanner.nextLine();

        Cliente cliente = new Cliente(1, "Cliente Anônimo", "Endereço não informado"); // Cliente padrão para avaliação
        produto.adicionarAvaliacao(cliente, estrelas, comentario);

        System.out.println("Avaliação registrada com sucesso!");
    }
}

