import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        //EXCEÇÕES MAIS VISTAS
        //java.lang.NullPointerException - quando tentamos obter alguma informação de uma variável nula.
        //java.lang.ArithmeticException - quando tentamos dividir um valor por zero
        //java.sql.AQLException - quando existem algum erro relacionado a interação com o banco de dados
        //java.io.FileNotFoundException - quando tentamos ler ou escrever um aquivo que não existe

        //Try - permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.
        //Catch - permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.
        //Finally - permite definir um cloco de código a ser executado independente de ocorrer um erro ou não.
    
        try{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos");
        }
    }
}
