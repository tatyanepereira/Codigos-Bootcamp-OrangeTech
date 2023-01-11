// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next"; 
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        // TODO: Crie a condi��o necess�ria para verificar se os carros est�o acima da velocidade

        // TODO2: Crie a condi��o para verificar se os motoristas receber�o ou n�o pontos na carteira de habilita��o
        boolean limiteVelocidade = velocidade <= 80;
        // TODO2: Crie a condi��o para verificar se os motoristas receber�o ou n�o pontos na carteira de habilita��o
        if(limiteVelocidade == false){
          multas++;
        }
        if(multas >= 3){
          System.out.println(multas + " multas. " + "Levou pontos na carteira");
        }else{
          System.out.println(multas + " multas. " + "Nao levou pontos na carteira");
        }
    }
