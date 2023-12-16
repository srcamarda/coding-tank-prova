import java.util.Scanner;

public class MainQuestao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Obtem o valor inteiro
        System.out.print("Digite um valor para o triangulo: ");
        int tamanho = input.nextInt();

        //Checa o tamanho
        if (tamanho <= 0) {
            System.out.println("Tamanho inválido!");
            return;
        }

        System.out.println();

        //Loop para montar o triangulo normal
        for(int i = 1; i <= (tamanho / 2) + 1; i++) {
            imprimeTriangulo(tamanho, i);
        }

        //Loop para a parte invertida
        for(int i = (tamanho / 2) + 1; i >= 1; i--) {
            imprimeTriangulo(tamanho, i);
        }
    }

    //Função para impressão das linhas
    private static void imprimeTriangulo(int tamanho, int i) {
        //Imprime espaços
        for(int j = tamanho; j > i; j--)
            System.out.print(" ");

        //Imprime asteriscos
        for(int k = 1; k <= (2 * i - 1); k++)
            System.out.print("*");

        System.out.println();
    }
}
