package com.nauryzbay.requestforge;

public class RequestDirector {

    private static final String JSON_HEADER = "Content-Type: application/json";
    private static final String SAMPLE_JSON_BODY = "{\"name\":\"John\"}";

    public void makeGetUserRequest(RequestBuilder builder, String url) {
        builder.setMethod(HttpMethod.GET)
                .setUrl(url);
    }

    public void makeCreateUserRequest(RequestBuilder builder, String url) {
        builder.setMethod(HttpMethod.POST)
                .setUrl(url)
                .setHeader(JSON_HEADER)
                .setBody(SAMPLE_JSON_BODY);
    }


}
