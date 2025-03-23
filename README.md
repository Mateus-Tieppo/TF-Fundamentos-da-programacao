# Sistema de Avaliação de Produtos

## 📌 Descrição do Projeto

Este projeto implementa um sistema de avaliação de produtos, onde clientes podem deixar comentários e dar notas (de 1 a 5 estrelas) para os produtos comprados. O sistema é composto por três classes principais: **Avaliacao**, **Produto** e **Pedido**, cada uma com suas respectivas responsabilidades.

## 🏗️ Estrutura das Classes

### ⭐ Classe Avaliacao

**Atributos:**
- Produto avaliado
- Cliente que fez a avaliação
- Nota (1 a 5)
- Comentário

**Métodos:**
- Getters e Setters
- `toString()` para exibir a avaliação formatada
- `isAvaliacaoPositiva()` que define avaliações a partir de 3 estrelas como positivas

### 📦 Classe Produto

**Atributos:**
- ID
- Nome
- Preço
- Estoque
- Categorias
- Matriz de avaliações (armazenando estrelas e comentários)

**Métodos:**
- Getters e Setters
- `toString()` para mostrar o produto e suas avaliações
- `adicionarAvaliacao()` que adiciona a avaliação com estrelas formatadas (exemplo: ***-- para 3 estrelas)

### 🛒 Classe Pedido

**Atributos:**
- ID
- Cliente
- Lista de itens (ItemPedido)
- Status do pedido

**Métodos:**
- Getters e Setters
- `toString()` para formatar o pedido
- `adicionarItem()` que gerencia a adição de itens ao pedido
- Métodos privados `percorrerArray()` e `expandirArray()` para lidar com o tamanho do array de itens

## ⚙️ Funcionalidades Implementadas

- Cadastramento de produtos e clientes
- Criação de pedidos com múltiplos itens
- Adição de avaliações a produtos
- Formatação visual de estrelas nas avaliações
- Expansão dinâmica do array de itens no pedido
