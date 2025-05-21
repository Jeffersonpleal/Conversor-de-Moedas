import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public ConversorEmPares buscaMoeda(String moeda1, String moeda2, double quantidade) throws IOException, InterruptedException {
        String endereco = "https://v6.exchangerate-api.com/v6/7ef03d2bb6f01c05197bb412/pair/" + moeda1 + "/" + moeda2 + "/" + quantidade;

        ConversorEmPares conversorEmPares = new ConversorEmPares();
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        conversorEmPares = gson.fromJson(response.body(), ConversorEmPares.class);
        System.out.println("\nExtrato da transação");
        System.out.println("---------------------------");
        System.out.printf("%-18s: %s\n", "Moeda de origem", conversorEmPares.getMoedaOrigem());
        System.out.printf("%-18s: %s\n", "Moeda de destino", conversorEmPares.getMoedaDestino());
        System.out.printf("%-18s: %.2f\n", "Quantidade", quantidade);
        System.out.printf("%-18s: %.4f\n", "Taxa de câmbio", conversorEmPares.getCotacaoMoeda());
        System.out.printf("%-18s: %.2f\n", "Valor convertido", conversorEmPares.getValorConvertido());
        System.out.println("---------------------------");

        System.out.printf("Valor %.2f [%s] corresponde ao valor final de -->  %.2f [%s]", quantidade, conversorEmPares.getMoedaOrigem(), conversorEmPares.getValorConvertido(), conversorEmPares.getMoedaDestino());

        return conversorEmPares;
    }
}
