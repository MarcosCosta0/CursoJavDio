
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos

    private List<Livro> livroList;
    

    public CatalogoLivros() {this.livroList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloDeAno (int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloDeAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloDeAno.add(l);
                }
            }
        }
        return livroPorIntervaloDeAno;
    }

    public Livro pesquisaPorTitulo(String Titutlo) {
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(Titutlo));
                livroPorTitulo = l;
                break;
            }
        
        }
        
        return livroPorTitulo;
    }
    

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro1", "autor2", 2001);
        catalogoLivros.adicionarLivro("Livro2", "autor2", 2002);
        catalogoLivros.adicionarLivro("Livro3", "autor3", 2003);
        catalogoLivros.adicionarLivro("Livro4", "autor3", 2004);
        catalogoLivros.adicionarLivro("Livro5", "autor5", 2005);

        System.out.println(catalogoLivros.pesquisaPorTitulo("autor2"));
        System.out.println(catalogoLivros.pesquisaPorTitulo("autor3"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2000, 2004));

        System.out.println(catalogoLivros.pesquisarPorAutor("Livro1"));
    }
}