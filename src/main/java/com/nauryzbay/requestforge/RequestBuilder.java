package com.nauryzbay.requestforge;

public interface RequestBuilder {
    RequestBuilder setMethod(HttpMethod method);
    RequestBuilder setUrl (String url);
    RequestBuilder setHeader(String header);
    RequestBuilder setBody (String body);
}
