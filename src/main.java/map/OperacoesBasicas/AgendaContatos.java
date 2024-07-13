import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome); 
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gaby", 98999992);
        agendaContatos.adicionarContato("Clari", 2222226);
        agendaContatos.adicionarContato("Thiago", 999977);

       agendaContatos.exibirContatos();

        agendaContatos.removerContato("Gaby");
        agendaContatos.exibirContatos();
        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Clari"));   
    }
}
