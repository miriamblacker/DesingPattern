package Builder;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestBuilder implements ApiRequestBuilderInterface {
    private String url;
    private String method;
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> parameters = new HashMap<>();
    private String body;

    @Override
    public ApiRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public ApiRequestBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public ApiRequestBuilder addHeader(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    @Override
    public ApiRequestBuilder addParameter(String key, String value) {
        this.parameters.put(key, value);
        return this;
    }

    @Override
    public ApiRequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public ApiRequest build() {
        ApiRequest request = new ApiRequest();
        request.setUrl(url);
        request.setMethod(method);
        request.setHeaders(headers);
        request.setParameters(parameters);
        request.setBody(body);
        return request;
    }
}
