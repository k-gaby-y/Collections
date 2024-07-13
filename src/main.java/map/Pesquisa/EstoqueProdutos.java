import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    //construtor
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE; 
        
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
              if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
              }  
            }
        }
        return produtoMaisCaro;  
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto 1", 10, 5.10);
        estoque.adicionarProduto(2L, "Produto 2", 5, 5.80);
        estoque.adicionarProduto(3L, "Produto 3", 2, 7.10);
        estoque.adicionarProduto(4L, "Produto 4", 15,20.0);
        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());
        System.out.println("O produto mais caro e o :" + estoque.obterProdutoMaisCaro());
    }


}
