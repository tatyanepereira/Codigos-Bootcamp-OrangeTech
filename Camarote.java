// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha. 

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        // TODO: Crie a condi��o necess�ria para verificar quais n�meros, de acordo com o range de entrada, s�o �mpares.
         if(tamanhoDaFila % 2 == 0){
          System.out.println(tamanhoDaFila/2 + " pessoas no camarote");
        }else{
          System.out.println(tamanhoDaFila/2 + 1 + " pessoas no camarote");
        }
    }
}

