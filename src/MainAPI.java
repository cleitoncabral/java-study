import br.com.sagaassistidos.title.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import br.com.sagaassistidos.title.TitleConvert;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner readingData = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var movie = readingData.nextLine();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=" + movie.replace(" ", "+") + "&apikey=343c5b04"))
                .build();

        HttpResponse<String> response = (HttpResponse<String>) client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        String jsonResponse = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TitleConvert myTitleConvert = gson.fromJson(jsonResponse, TitleConvert.class);
        try {
            Title myTitle = new Title(myTitleConvert);
            System.out.println(myTitle.showTitleDetails());
        } catch (NumberFormatException e) {
            System.out.println("Erro encontrado:");
            System.out.println(e.getMessage());
        }



    }
}
