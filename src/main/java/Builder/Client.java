package Builder;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        ApiRequestBuilderInterface builder = new ApiRequestBuilder();
        Director director = new Director(builder);

        Map<String, String> getParams = new HashMap<>();
        getParams.put("query", "example");
        ApiRequest getRequest = director.constructGet("https://example.com/api", getParams);
        getRequest.showDetails();

        Map<String, String> postHeaders = new HashMap<>();
        postHeaders.put("Content-Type", "application/json");
        String postBody = "{\"key\": \"value\"}";
        ApiRequest postRequest = director.constructPost("https://example.com/api", postHeaders, postBody);
        postRequest.showDetails();
    }
}
