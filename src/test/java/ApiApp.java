import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.UnsupportedEncodingException;

public class ApiApp {
    public static void main(String[] args) throws UnsupportedEncodingException, UnirestException {
        /*// Host url
        String host = "https://currency-exchange.p.rapidapi.com/exchange";

        String charset = "UTF-8";
        // Headers for a request
        String x_rapidapi_host = "currency-exchange.p.rapidapi.com";
        String x_rapidapi_key = "6db163f092msh7a17cdc718edd2ep15fb0ejsne06245429072";//Type here your key
        // Params
        String s = "Pulp";
        // Format query for preventing encoding problems
        *//*String query = String.format("s=%s",
                URLEncoder.encode(s, charset));*//*

        String query="q=1.0&from=SGD&to=MYR";


        HttpResponse<JsonNode> response = Unirest.get(host + "?" + query)
                .header("x-rapidapi-host", x_rapidapi_host)
                .header("x-rapidapi-key", x_rapidapi_key)
                .asJson();
        System.out.println(response.getStatus());
        System.out.println(response.getHeaders().get("Content-Type"));*/

        HttpResponse<String> response = Unirest.get("https://currency-exchange.p.rapidapi.com/exchange?q=1.0&from=EUR&to=IRR")
                .header("x-rapidapi-host", "currency-exchange.p.rapidapi.com")
                .header("x-rapidapi-key", "6db163f092msh7a17cdc718edd2ep15fb0ejsne06245429072")
                .asString();

        System.out.println("#####  " + response.getBody());
    }
}
