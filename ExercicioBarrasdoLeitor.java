// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        // TODO: Crie a condi��o necess�ria para que, de acordo com o tamanho, seja printado no console barras representando o download

        for (int i = 0; i< tamanho; i++){
          System.out.print("/");
        }
          
        
        // TODO: Crie a condi��o necess�ria para que, de acordo com o tamanho, seja printado no console barras representando o download

    }
}
