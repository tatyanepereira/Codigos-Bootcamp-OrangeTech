// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        // TODO: Crie a condi��o necess�ria para que Getrudes saiba em quanto tempo terminar� seus livros
        int tempoDeLeitura = paginas/paginasLidas;
        System.out.println(tempoDeLeitura + " dias");
    }
}
