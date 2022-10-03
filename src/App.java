import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float n1, n2, n3, n4, media;
        System.out.println("Digite o valor da nota 1: ");
        n1 = input.nextFloat();
        System.out.println("Digite o valor da nota 2: ");
        n2 = input.nextFloat();
        System.out.println("Digite o valor da nota 3: ");
        n3 = input.nextFloat();
        System.out.println("Digite o valor da nota 4: ");
        n4 = input.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("O valor da média das suas notas é: " + media);
        input.close();
    }
}
