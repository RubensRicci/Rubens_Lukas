package testalistaponto;

import java.util.Scanner;

public class TestaListaPonto {


    public static void main(String[] args) {
        Scanner  ler = new Scanner(System.in);
        // cria o container listaPonto com 100 posicoes
        //Ponto p = new Ponto(1, 2);
        //System.out.println(p.getX()+""+p.getY());
        listaPonto container = new listaPonto(100);
        // while infinito
        while( true ){
            // cria o menu para o usuario
            System.out.println("1-Adicionar no final");
            System.out.println("2-Adicionar em posicao");
            System.out.println("3-Pesquisa em posicao");
            System.out.println("4-Remover Elemento do vetor");
            System.out.println("5-Calcular a distância dos dois pontos mais distantesna coleção");
            System.out.println("6-Pontos contidos em uma circunferência");
            System.out.println("7-Sair");
            // pega a opcao do usuario
            System.out.print("escolha uma opcao:");
            int opc = ler.nextInt();
            if( opc == 1 ){
                // adiciona um ponto no final da colecao
                int x, y;
                System.out.print("digite o x:");
                x = ler.nextInt();
                System.out.print("digite o y:");
                y = ler.nextInt();
                
                //cria um novo ponto
                Ponto p= new Ponto(x, y);
                //O método adiciona recebe como parâmetro o novo 
                //elemento, ou seja, um objeto da classe Ponto.
                container.adiciona(p);
                //container.imprime();
                System.out.println(container);
            }
            if( opc == 2 ){
                // adiciona um ponto no final da colecao
                int x, y, posicao;
                System.out.print("digite o x:");
                x = ler.nextInt();
                System.out.print("digite o y:");
                y = ler.nextInt();
                System.out.print("digite uma posicao:");
                posicao = ler.nextInt();
                //cria um novo ponto
                Ponto p= new Ponto(x, y);
                container.local(posicao);
                //O método adiciona recebe como parâmetro o novo 
                //elemento, ou seja, um objeto da classe Ponto.
                container.AddComPosi(p);
                //container.imprime();
                System.out.println(container);
            }
            if( opc == 3 ){
                // adiciona um ponto no final da colecao
                int x, y;
                System.out.print("digite o x:");
                x = ler.nextInt();
                System.out.print("digite o y:");
                y = ler.nextInt();
                //cria um novo ponto
                Ponto p= new Ponto(x, y);
                //O método adiciona recebe como parâmetro o novo 
                //elemento, ou seja, um objeto da classe Ponto.
                container.pesquisa(p);
                //container.ResulPes;
//                System.out.println(container.pontos[0]);
//                System.out.println(container.NumePesquisado[0]);
                System.out.println(container.Resultado);
            }
             if (opc == 4 ){
                
                 int posicao;
                System.out.print("digite a posicao a ser removida:");
                posicao = ler.nextInt();
                container.local(posicao);
                container.removerVetor();
                 System.out.println(container);
               }
             if (opc == 5 ){
                 container.CalculaDistância();
                 System.out.println(container.Resultado);
             }
             if (opc == 6) {
                int x, y;
                 System.out.println("digite o raio");
                float raio = ler.nextFloat();
                System.out.print("digite o x:");
                x = ler.nextInt();
                System.out.print("digite o y:");
                y = ler.nextInt();
                //cria um novo ponto
                Ponto p= new Ponto(x, y);
                container.circufarencia(p, raio);
                System.out.println(container.Resultado);
                
            }
             if( opc == 7 ){
                // sair do programa
                break;
             }
        }// fim do while
        System.out.println("fim do programa.");
        
    }
    
}
