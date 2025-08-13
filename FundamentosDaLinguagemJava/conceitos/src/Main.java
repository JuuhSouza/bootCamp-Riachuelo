import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = scanner.next();
        System.out.println("E sua idade?");
        int age = scanner.nextInt();

        System.out.println("Seu nome é " + name + " e sua idade é " + age);

        //outro jeito de se fazer o sout com o printf ele n faz a quebra de linha igual o println
        System.out.printf("Ola meu nome é %s e tenho %s anos \n", name, age);
    }
}
