package Builder;

import lombok.Getter;
import lombok.Setter;
import java.util.Map;

@Getter
@Setter
public class ApiRequest {

    private String url;
    private String method;
    private Map<String, String> headers;
    private Map<String, String> parameters;
    private String body;

    public void showDetails() {
        System.out.println("URL: " + url);
        System.out.println("Method: " + method);
        System.out.println("Headers: " + headers);
        System.out.println("Parameters: " + parameters);
        System.out.println("Body: " + body);
    }
}

