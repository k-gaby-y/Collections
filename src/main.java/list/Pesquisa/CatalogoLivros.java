import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    //construtor
    public CatalogoLivros(){ this.livroList = new ArrayList<>();}

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
       livroList.add(new Livro(titulo, autor, anoPublicacao)); 
    }


    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

       if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                  livrosPorAutor.add(l);  
                }
            }
       } 
       return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>(); 

        if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);    
                }
            }
           

        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
       Livro livroPorTitulo = null;
       
       if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo=l;
                    break;
                }
            }
       }
       return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2011);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 1991);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 1988);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogoLivros.pesquisaPorIntervaloDeAnos(1987,1991));

        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 3"));
    }

}
