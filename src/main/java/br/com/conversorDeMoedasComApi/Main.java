package main.java.br.com.conversorDeMoedasComApi;

import main.java.br.com.conversorDeMoedasComApi.model.ConversorDeMoedas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();

        Scanner leitura = new Scanner(System.in);
        int escolha;

        do{

            System.out.println("*************** Conversor de Moedas ******************");
            System.out.println("\n");
            System.out.println("Escolha qual conversão deseja fazer:");
            System.out.println("1 - Real para Dólar");
            System.out.println("2 - Dólar para Real");
            System.out.println("3 - Real para Euro");
            System.out.println("4 - Euro para Real");
            System.out.println("5 - Real para Peso Argentino");
            System.out.println("6 - Peso Argentino para Real");
            System.out.println("0 - Sair");
            System.out.println("\n");
            System.out.println("******************************************************");

            try {
                System.out.println(" Digite sua opção: ");
                escolha = leitura.nextInt();
                leitura.nextLine();

                switch (escolha) {
                    case 1:
                        System.out.println("R$ para USD");
                        System.out.println("Digite o valor para conversão: R$ ");
                        double valorParaConversaoRealParaDolar = leitura.nextDouble();
                        leitura.nextLine();

                        double resultadoRealParaDolar = conversorDeMoedas.converterRealParaDolar(valorParaConversaoRealParaDolar);
                        System.out.println("Valor convertido: USD " + resultadoRealParaDolar);

                        break;

                    case 2:
                        System.out.println("USD para R$");
                        System.out.println("Digite o valor para conversão: USD ");
                        double valorParaConversaoDolarParaReal = leitura.nextDouble();
                        leitura.nextLine();

                        double resultadoDolarParaReal = conversorDeMoedas.converterDolarParaReal(valorParaConversaoDolarParaReal);
                        System.out.println("Valor convertido R$ " + resultadoDolarParaReal);

                        break;

                    case 3:
                        System.out.println("R$ para €");
                        System.out.println("Digite o valor para conversão: R$ ");
                        double valorParaConversaoRealParaEuro = leitura.nextDouble();
                        leitura.nextLine();

                        double resultadoRealParaEuro = conversorDeMoedas.converterDolarParaReal(valorParaConversaoRealParaEuro);
                        System.out.println("Valor convertido € " + resultadoRealParaEuro);

                        break;

                    case 4:
                        System.out.println("€ para R$");
                        System.out.println("Digite o valor para conversão: € ");
                        double valorParaConversaoEuroParaReal = leitura.nextDouble();
                        leitura.nextLine();

                        double resultadoEuroParaReal = conversorDeMoedas.converterDolarParaReal(valorParaConversaoEuroParaReal);
                        System.out.println("Valor convertido € " + resultadoEuroParaReal);

                        break;

                    case 5:
                        System.out.println("R$ para $");
                        System.out.println("Digite o valor para conversão: R$ ");
                        double valorParaConversaoRealParaPesoArgentino = leitura.nextDouble();
                        leitura.nextLine();

                        double resultadoRealParaPesoArgentino = conversorDeMoedas.converterDolarParaReal(valorParaConversaoRealParaPesoArgentino);
                        System.out.println("Valor convertido $ " + resultadoRealParaPesoArgentino);

                        break;

                    case 6:
                        System.out.println("$ para R$");
                        System.out.println("Digite o valor para conversão: $ ");
                        double valorParaConversaoPesoArgentinoParaReal = leitura.nextDouble();
                        leitura.nextLine();

                        double resultadoPesoArgentioParaReal = conversorDeMoedas.converterDolarParaReal(valorParaConversaoPesoArgentinoParaReal);
                        System.out.println("Valor convertido R$ " + resultadoPesoArgentioParaReal);

                        break;

                    default:

                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida! Digite um número válido.\n");
                leitura.nextLine();
                escolha = -1;
            }

        } while (escolha != 0);

        leitura.close();

    }

}
