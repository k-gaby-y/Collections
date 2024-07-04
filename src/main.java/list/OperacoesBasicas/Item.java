public class Item {
    
    private String descricao;

    //construtor
    private String nome;
	private double preco;
	private int quant;

	public Item(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

    //metodo get
    public String getNome(){
        return nome;

    }

    public double getPreco(){
        return preco;

    }

    public int getQuant(){
        return quant;

    }


    @Override
    public String toString() {
        
        return  descricao + preco + quant;
    }
}
