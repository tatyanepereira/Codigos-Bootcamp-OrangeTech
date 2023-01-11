// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha. 
// - O m�todo .split() quebra uma String em v�rias substrings a partir de um caracter definido por voc� e coloca em um array. 

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        
        // TODO: Crie a condi��o necess�ria para formatar e printar o texto da maneira pedida na sa�da
        listaIngredientes = ingredientes.split(";");
        for(String x : listaIngredientes){
          System.out.println(x);
        }
    }
}

