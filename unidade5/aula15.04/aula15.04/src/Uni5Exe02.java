/*Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100. */

//ENTRADAS
  //não há
//SAÍDAS
  // Ssoma dos numeros pares de 1 a 100
  // soma dos numeros impares de 1 a 100

public class Uni5Exe02 {

    public static void main(String[] args) {
        
        int numeroP = 0;
        int numeroI = 0;
       
        for (int i = 1; i <= 100; i ++){
           
            if (i % 2 == 0){
                numeroP += i;

            }else{
                numeroI += i;
            }
        } 
         System.out.println("Soma pares: " + numeroP);
         System.out.println("Soma ímpares: " + numeroI);

    }
    
}
