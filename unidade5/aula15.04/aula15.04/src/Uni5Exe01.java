/*Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar. */
//ANÁLISE
    //na descrição encontram-se todas as informações para a resolução do problema
//ENTRADA
    //numeros inteiros
//SAÍDA
    // informar se o numero digitado é par ou ímpar
//TESTES
    //se o usuário digitar um numero par, o algoritmo vai informar que é um numero par, exemplo: 
        // 2 --> é par
        // 8 --> é par
        //18 --> é par
    //se o usuário digitar um numero pímpar, o algoritmo vai informar que é um numero ímpar, exemplo: 
        // 3 --> é ímpar
        // 9 --> é ímpar
        // 17 --> é ímpar

// importando o Scanner para ler o que o usuário digitar
import java.util.Scanner;

// definição da classe 
public class Uni5Exe01 {

// metodo void para rodar o programa
    public static void main(String[] args) {
        
//
        Scanner teclado = new Scanner(System.in);
        
       
        for (int i = 1; i <= 20; i ++){
            System.out.print("Digite um numero ("+ i +"/20): ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0){
                System.out.println("Par");

            }else{
                System.out.println("Ímpar");
            }

        } 
        teclado.close();
    }
    
}
