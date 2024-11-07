package Builder;

public interface ApiRequestBuilderInterface {

    ApiRequestBuilderInterface setUrl(String url);
    ApiRequestBuilderInterface setMethod(String method);
    ApiRequestBuilderInterface addHeader(String key, String value);
    ApiRequestBuilderInterface addParameter(String key, String value);
    ApiRequestBuilderInterface setBody(String body);
    ApiRequest build();

}
