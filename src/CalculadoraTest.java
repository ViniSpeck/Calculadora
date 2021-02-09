import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        double numeroUm;
        double numeroDois;
        int operacao;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("\nOperações disponíveis: ");
            System.out.println("(1) Adição");
            System.out.println("(2) Subtração");
            System.out.println("(3) Multiplicação");
            System.out.println("(4) Divisão");
            System.out.println("(5) Sair\n");

            System.out.println("Insira a operação desejada: ");
            operacao = input.nextInt();

            System.out.println("Insira o primeiro número: ");
            numeroUm = input.nextDouble();

            System.out.println("Insira o segundo número: ");
            numeroDois = input.nextDouble();

            Calculadora calculadora = new Calculadora(numeroUm, numeroDois);

            System.out.printf("\nResultado: ");

            switch (operacao) {
                case 1:
                    System.out.println(calculadora.getSum());
                    break;
                case 2:
                    System.out.println(calculadora.getSubtraction());
                    break;
                case 3:
                    System.out.println(calculadora.getMultiplication());
                    break;
                case 4:
                    try {
                        System.out.println(calculadora.getDivision());
                    }
                    catch (IllegalArgumentException exception) {
                        System.out.println("Erro: " + exception.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Fim do processo");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(operacao!=5);
    }
}
