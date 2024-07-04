
public class Tarefa {
    
    private String descricao;

    //construtor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    //metodo get
    public String getDescricao(){
        return descricao;

    }


    @Override
    public String toString() {
        
        return  descricao;
    }
}
