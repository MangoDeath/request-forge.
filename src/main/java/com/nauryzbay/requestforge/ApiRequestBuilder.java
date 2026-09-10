package com.nauryzbay.requestforge;

public class ApiRequestBuilder implements RequestBuilder {

    private HttpMethod method;
    private String url;
    private String header;
    private String body;

    @Override
    public ApiRequestBuilder setMethod(HttpMethod method) {
        this.method = method;
        return this;
    }

    @Override
    public ApiRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public ApiRequestBuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    @Override
    public ApiRequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public ApiRequest getResult() {
        if (method == null || url == null || url.isBlank()) {
            throw new IllegalStateException("Method and URL are required to build an ApiRequest");
        }
        return new ApiRequest(method, url, header, body);
    }
}