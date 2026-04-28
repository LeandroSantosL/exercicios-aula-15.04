/* Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos*/

// ENTRADAS:
  //não recebe entrada do usuário. Ele sempre calcula a soma de 1 até 100. Não depende de teclado ou dados externos;

// SAÍDAS:
  //Sempre será um número fixo (aproximado)


// nome da classe
public class Uni5Exe03 {
    // ponto de entrada do programa
    public static void main(String[] args) {
        
        // cria uma variável chamada soma do tipo double que aceita casas decimais (vai servir como acumulador)
        double soma = 0;

        // laço de repetição
        for (int i = 1; i <= 100; i++ ){ // int i = 1; começa em 1
                                     // i <= 100; repete até 100
                                    // i++ aumenta 1 a cada volta
                                    // significa que o bloco vai rodar 100 vezes

            soma = soma + (1.0 / i); // 1.0/1 calcula o termo atual
                                    // soma = soma + ... acumula o resultado
        }
        // imprime o resultado ao usuário
        System.out.println("Resultado: " + soma);
    }

    
}
