package Builder;

import java.util.Map;

public class Director {
    private ApiRequestBuilderInterface builder;

    public Director(ApiRequestBuilderInterface builder) {
        this.builder = builder;
    }

    public ApiRequest constructGet(String url, Map<String, String> parameters) {
        builder.setUrl(url)
                .setMethod("GET");
        if (parameters != null) {
            parameters.forEach(builder::addParameter);
        }
        return builder.build();
    }

    public ApiRequest constructPost(String url, Map<String, String> headers, String body) {
        builder.setUrl(url)
                .setMethod("POST");
        if (headers != null) {
            headers.forEach(builder::addHeader);
        }
        builder.setBody(body);
        return builder.build();
    }
}
