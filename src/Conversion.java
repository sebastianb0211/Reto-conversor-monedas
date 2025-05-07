
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Conversion {

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public void conversionMonedas(String moneda1,String moneda2, Double cantidad) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/971c9e2a1b3c9c2cecd1d663/pair/"
                        +moneda1+"/"+moneda2+"/"+cantidad))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String datosDivisa = response.body();

        Divisa divisa= gson.fromJson(datosDivisa,Divisa.class);

        System.out.println("El valor "+ cantidad+" "+ divisa.base_code()+
                " corresponde al valor de ==> "+divisa.conversion_result()+" "+divisa.target_code());
        System.out.println("*******************************************");
    }
}
