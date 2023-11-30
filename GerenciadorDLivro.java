import java.util.ArrayList;

public class GerenciadorDLivro {
   
    private ArrayList<Livro> acervo = new ArrayList<Livro>();

    public ArrayList getAcervo(){
        return acervo;
    }

    public int addLivro(String Titulo, String Autor, int AnoPublicacao){
        Livro l = new Livro(Titulo, Autor, AnoPublicacao);
        this.acervo.add(l);
        return 1;
        
    }
    public void addLivro(Livro l){
        this.acervo.add(l);
    }
    public int removerLivro(String Titulo){
      
        for(Livro livro : acervo){
            if(livro.getTitulo().equals(Titulo)){
                this.acervo.remove(livro);
                return 1;
            }
        }
        return 0;
    }
    public int exibirLivro(String Titulo){
        for(Livro l : acervo){
            if(l.getTitulo().equals(Titulo)){
                System.out.println("Livro: "+l.getTitulo());
                System.out.println("Ano da publicção: "+l.getAnoPublicacao());
                System.out.println("Autor: "+l.getAutor());
                return 1;
            }
        }
        return 0;
    }
    public void exibirListaLivros(){
        for(Livro l : acervo){
            System.out.println("***********************");
            System.out.println("Livro: "+l.getTitulo());
            System.out.println("Ano da publicção: "+l.getAnoPublicacao());
            System.out.println("Autor: "+l.getAutor());
        }
    }
}
