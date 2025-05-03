package conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorApp {

    public static void main(String[] args) {
        double valorAConverter;
        String meuTipo = "";
        String tipoAlvo = "";
        int op = 1;
        Scanner sc = new Scanner(System.in);

        while (op != 0) {
            try {
                System.out.println("Selecione uma opção");
                System.out.println("0) sair");
                System.out.println("1) Converter USD para BRL");
                System.out.println("2) Converter BRL para USD");
                op = sc.nextInt();

                if (op == 1) {
                    meuTipo = "USD";
                    tipoAlvo = "BRL";
                } else if (op == 2) {
                    meuTipo = "BRL";
                    tipoAlvo = "USD";
                } else if (op != 0) {
                    throw new IllegalArgumentException("Opção invalida");
                } else {
                    System.out.println("Adeus");
                    break;
                }

                System.out.println("Valor a converter:");
                valorAConverter = sc.nextDouble();

                if (valorAConverter < 0 ) throw new IllegalArgumentException("Valor não pode ser negativo");

                URI uri = URI.create("https://v6.exchangerate-api.com/v6/983ce5736bcec99dae15d415/latest/" + meuTipo);


                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(uri)
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

                String baseCode = jsonObject.get("base_code").getAsString();

                System.out.println("Base: " + baseCode);

                JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
                double alvoRate = conversionRates.get(tipoAlvo).getAsDouble();
                System.out.println("Conversão de " + meuTipo + " para " + tipoAlvo + " no valor de " + valorAConverter);
                System.out.println("Valor retornado: " + (alvoRate * valorAConverter));

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        }
    }


}
