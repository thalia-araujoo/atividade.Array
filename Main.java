import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int cont =0;
        int opcao;
        while(cont!=1){
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Cadastrar livro\n"+ "2 - remover livro\n"+ "3 - Exibir livro\n"+ "4 - Listar todos os livros\n"+ "5 - Sair");
            opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe os dados do livro: ");
                    System.out.println("Titulo:");
                    String Titulo = ler.nextLine();
                    System.out.println("Ano: ");
                    int AnoPublicacao = ler.nextInt();
                    System.out.println("Autor:");
                    String Autor = ler.nextLine();
                    gl.addLivro(Titulo, AnoPublicacao, Autor);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

            }

        }
       
    }
}