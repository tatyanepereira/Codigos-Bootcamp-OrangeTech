// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha. 
// - O m�todo .split() quebra uma String em v�rias substrings a partir de um caracter definido por voc� e coloca em um array. 

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        
        array = frase.split("/");
        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
        
        
        // TODO: Crie a condi��o necess�ria para remover as barras da String e apresentar de forma mais amig�vel

    }
}
