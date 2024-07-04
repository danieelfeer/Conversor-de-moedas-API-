package main.java.br.com.conversorDeMoedasComApi.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedasApiClient {

    public ResultadoConversao converter(String moedaBase, String moedaAlvo, double valor) {
        HttpClient client = HttpClient.newHttpClient();

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/9b25addf5a738a0f14b6b70c/pair/" + moedaBase + "/"+ moedaAlvo +"/" + valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        {
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                JsonParser parser = new JsonParser();
                JsonObject jsonObject = parser.parse(response.body()).getAsJsonObject();

                double resultado = jsonObject.get("conversion_result").getAsDouble();

                return new Gson().fromJson(response.body(), ResultadoConversao.class);

            } catch (Exception e) {
                throw new RuntimeException("Ocorreu um Erro");
            }
        }
    }
}
