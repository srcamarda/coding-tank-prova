import java.util.Scanner;

public class MainQuestao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Obtem a temperatura
        System.out.print("Informe a temperatura: ");
        double temperatura = input.nextDouble();

        //Obtem a unidade de origem
        System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F] ");
        String unidade = input.next();

        //Checa a unidade de origem
        if (!unidade.equals("C") && !unidade.equals("K") && !unidade.equals("F")) {
            System.out.println("Unidade inválida!");
            return;
        }

        //Obtem a unidade de destino
        System.out.print("Qual a unidade de destino dessa temperatura? [C, K, F] ");
        String unidadeDestino = input.next();

        //Checa a unidade de destino
        if (!unidadeDestino.equals("C") && !unidadeDestino.equals("K") && !unidadeDestino.equals("F")) {
            System.out.println("Unidade inválida!");
            return;
        }

        //Calcula a temperatura de destino
        double temperaturaDestino = getTemperaturaDestino(temperatura, unidadeDestino, unidade);

        //Mostra temperatura final
        System.out.printf("%.2f %s = %.2f %s", temperatura, unidade, temperaturaDestino, unidadeDestino);

        input.close();
    }

    //Função para cálculo das temperaturas
    private static double getTemperaturaDestino(double temperatura, String unidadeDestino, String unidade) {
        double temperaturaDestino = temperatura;

        if (unidadeDestino.equals("C")){

            if (unidade.equals("K"))                                        //Kelvin para Celsius
                temperaturaDestino = temperatura - 273.15;

            else if (unidade.equals("F"))                                   //Fahrenheit para Celsius
                temperaturaDestino = (temperatura - 32) * 5 / 9;
        }

        else if (unidadeDestino.equals("K")) {

            if (unidade.equals("C"))                                        //Celsius para Kelvin
                temperaturaDestino = temperatura + 273.15;

            else if (unidade.equals("F"))                                   //Fahrenheit para Kelvin
                temperaturaDestino = (temperatura - 32) * 5 / 9 + 273.15;
        }

        else {

            if (unidade.equals("C"))                                        //Celsius para Fahrenheit
                temperaturaDestino = (temperatura * 9 / 5) + 32;

            else if (unidade.equals("K"))                                   //Kelvin para Fahrenheit
                temperaturaDestino = (temperatura - 273.15) * 9 / 5 + 32;
        }
        return temperaturaDestino;
    }
}