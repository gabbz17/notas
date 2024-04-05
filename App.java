import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        float n1, n2, n3, soma;
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dgite o nome do aluno: ");
        nome = entrada.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextFloat();
        soma = (n1 + n2 + n3) / 3;

        System.out.println("A média final de " + nome + " foi: " + soma);

        if (soma >= 6) {
            System.out.println("APROVADO");
        } else if (soma == 5) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
        entrada.close();
    }
}
