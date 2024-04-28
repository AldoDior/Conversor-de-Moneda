import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class APIExchangeRate {
    private static final String API_KEY = "543e66f24f53a074cb52a3db";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    private static class ApiResponse {
        @SerializedName("conversion_rates")
        Map<String, Double> conversionRates;
    }

    public static double convertCurrency(String from, String to) throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        String url = BASE_URL + API_KEY + "/latest/" + from;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);
            if (apiResponse.conversionRates != null && apiResponse.conversionRates.containsKey(to)) {
                return apiResponse.conversionRates.get(to);
            } else {
                throw new NullPointerException("Conversion rate for " + to + " is not available.");
            }
        } else {
            throw new IOException("Failed to get response: " + response.statusCode());
        }
    }
}



