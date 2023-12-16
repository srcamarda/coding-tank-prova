import java.util.Scanner;
public class MainQuestao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Obtem o valor do empréstimo
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = input.nextDouble();

        //Checa o valor do empréstimo
        if (valorEmprestimo <= 0) {
            System.out.println("Valor do empréstimo inválida!");
            return;
        }

        //Obtem a taxa de juros
        System.out.print("Digite a taxa de juros (Ex.: 2 para 2%): ");
        double taxaJuros = input.nextDouble();

        //Checa a taxa de juros
        if (taxaJuros <= 0) {
            System.out.println("Taxa de juros inválida!");
            return;
        }

        //Obtem o tempo de pagamento
        System.out.print("Digite o tempo de pagamento em meses: ");
        int tempoPagamento = input.nextInt();

        //Checa o tempo de pagamento
        if (tempoPagamento <= 0) {
            System.out.println("Quantidade de meses inválida!");
            return;
        }

        //Define valores iniciais
        double amortizacao = valorEmprestimo / tempoPagamento;
        double saldoDevedorAtual = valorEmprestimo;

        //Exibe o cabeçalho
        System.out.printf("\nValor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f%% ao mês%n", amortizacao, valorEmprestimo, taxaJuros);
        System.out.println("--------------------------------------------------------------------------------");

        //Loop pelos meses de pagamento
        double totalParcelas = 0;
        double totalJuros = 0;
        for (int i = 1; i <= tempoPagamento; i++) {
            double jurosMensal = saldoDevedorAtual * (taxaJuros / 100);
            double parcelaMensal = jurosMensal + amortizacao;
            saldoDevedorAtual = Math.abs(saldoDevedorAtual - amortizacao);
            totalParcelas += parcelaMensal;
            totalJuros += jurosMensal;

            //Exibe as informações da parcela atual
            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f%n", i, jurosMensal, parcelaMensal, saldoDevedorAtual);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f%n", totalParcelas, totalJuros, valorEmprestimo);

        input.close();
    }
}