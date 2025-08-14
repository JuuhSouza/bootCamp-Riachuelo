import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero : ");
    int value1 = scanner.nextInt();

        System.out.println("Digite o segundo numero : ");
        int value2 = scanner.nextInt();
        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2)); // colocamos os numeros em () pois se n ele ira detectar como todo.
        System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
        System.out.println(value1 + " / " + value2 + " = " + (value1 / value2));
        System.out.println(value1 + " x " + value2 + " = " + (value1 * value2));
        
        int value = 4 * (8 + 3) / (10 - 5);
        System.out.println(value);
    }
}