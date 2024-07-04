import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    
     private List<Item> itemList;

    //construtor
    public CarrinhoCompras(){
        this.itemList = new ArrayList<>();
    }

    //metodo adicionar tarefa
    public void adicionarItem(String nome, double preco, int quant){
        Item item = new Item(nome, preco, quant);
        this.itemList.add((item));
    }

    //metodo para remover tarefa 
    public void removerItem(String nome){
      List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item t : itemList){
                if(t.getNome().equalsIgnoreCase(nome)){
                     itensParaRemover.add(t);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else{

            System.out.println("A lista esta vazia");

        }
      
      
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
      

    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
          System.out.println(this.itemList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    

    public String toString() {
        return "CarrinhoDeCompras{" +
            "itens=" + itemList +
            '}';
      }

      public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoCompras carrinhoDeCompras = new CarrinhoCompras();
    
        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
      }
    


}
