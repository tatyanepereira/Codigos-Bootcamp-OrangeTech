// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha. 
// - O m�todo .contains() verificar se em uma determinada String tem um determinado caractere ou um conjunto deles

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        // TODO: Crie a condi��o necess�ria para verificar o formato do arquivo de entrada
         if(arquivoDoPc.endsWith(".mp3")){
          System.out.println("Salvar");
        }else{
          System.out.println("Deletar");
        }
    }
}
