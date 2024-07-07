import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{
    private List<Pessoa> pessoaList;


    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade =  new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura =  new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 37, 2.60);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 32, 1.67);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 24, 1.55);

       System.out.println(ordenacaoPessoa.ordenarPorIdade());
       System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}

