import java.util.Scanner;

public class TesteSwitch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1 - Jogar");
        System.out.println("2 - Configurações");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu jogar!");
                break;

            case 2:
                System.out.println("Você abriu configurações!");
                break;

            case 3:
                System.out.println("Saindo do jogo...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        teclado.close();
    }
}
