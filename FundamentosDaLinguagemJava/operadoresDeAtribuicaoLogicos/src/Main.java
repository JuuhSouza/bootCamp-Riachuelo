import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        System.out.println("Quanto é 5 + 5 ? ");
//        var resultado = scanner.nextInt();
//        var right = resultado == 10; // resultado == 10 é a comparação de resultado ou seja se o resultado for 10 sera true senao sera false.
//        System.out.printf("O resultado é 10, voce acertou ? %s ", right);

//        System.out.println("qual sua idade ?");
//        var scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        System.out.println("Voce é emancipado? ");
//        var canDrive = age >= 18;
//        System.out.printf("Voce pode dirigir ? (%s) \n ", canDrive);

        //outro jeito

        System.out.println("qual sua idade ?");
        var scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Voce é emancipado? ");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age > 16);  // || siginifica ou, se vc for maior ou igual a 18 ou voce for emancipado vc pode fazer carteira de motorista.
        System.out.printf("Voce pode dirigir ? (%s) \n ", canDrive);

    }
}