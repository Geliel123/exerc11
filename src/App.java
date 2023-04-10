import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o numero inteiro: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite um outro numero inteiro: ");
        int num2 = teclado.nextInt();

        System.out.println("Digite um numero real: ");
        double num3 = teclado.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, 3);

        System.out.println("Resultado1 é:" + resultado1);
        System.out.println("Resultado1 é:" + resultado2);
        System.out.println("Resultado3 é:" + resultado3);
    }

}
