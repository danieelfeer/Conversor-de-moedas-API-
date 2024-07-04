package main.java.br.com.conversorDeMoedasComApi.model;

public class ConversorDeMoedas {

    private final ConversorDeMoedasApiClient apiClient;

    public ConversorDeMoedas() {
        this.apiClient = new ConversorDeMoedasApiClient();
    }

    public double converterRealParaDolar(double valorUsuario) {
        ResultadoConversao conversor = apiClient.converter("BRL", "USD", valorUsuario);
        return conversor.conversion_result();
    }

    public double converterDolarParaReal(double valorUsuario) {
        ResultadoConversao conversor = apiClient.converter("USD", "BRL", valorUsuario);
        return conversor.conversion_result();
    }

    public double converterRealParaEuro(double valorUsuario) {
        ResultadoConversao conversor = apiClient.converter("BRL", "EUR", valorUsuario);
        return conversor.conversion_result();
    }


    public double converterEuroParaReal(double valorUsuario) {
        ResultadoConversao conversor = apiClient.converter("EUR", "BRL", valorUsuario);
        return conversor.conversion_result();
    }

    public double converterRealParaPesoArgentino(double valorUsuario) {
        ResultadoConversao conversor = apiClient.converter("BRL", "ARS", valorUsuario);
        return conversor.conversion_result();
    }

    public double converterPesoArgentinoParaReal(double valorUsuario) {
        ResultadoConversao conversor = apiClient.converter("ARS", "BRL", valorUsuario);
        return conversor.conversion_result();
    }
}

