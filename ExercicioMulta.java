// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m?todos ?teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa?da (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        if(velocidadeAtual <= 60){
          System.out.println("Nao foi multado");
        }
        else if(velocidadeAtual > 60){
          System.out.println("Foi multado");
        }
        
        // TODO: Crie a condi??o necess?ria para verificar se o motorista, de acordo com a entrada, foi multado ou n?o.

    }
}
