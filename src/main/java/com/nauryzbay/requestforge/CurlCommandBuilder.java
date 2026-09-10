package com.nauryzbay.requestforge;

public class CurlCommandBuilder implements RequestBuilder {

    private static final String FLAG_METHOD = "-X";
    private static final String FLAG_HEADER = "-H";
    private static final String FLAG_BODY = "-d";

    private HttpMethod method;
    private String url;
    private String header;
    private String body;

    @Override
    public CurlCommandBuilder setMethod(HttpMethod method) {
        this.method = method;
        return this;
    }

    @Override
    public CurlCommandBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public CurlCommandBuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    @Override
    public CurlCommandBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public String getResult() {
        if (method == null || url == null || url.isBlank()) {
            throw new IllegalStateException("Method and URL are required to build a curl command");
        }

        StringBuilder sb = new StringBuilder("curl ");
        sb.append(FLAG_METHOD).append(" ").append(method).append(" ");

        if (header != null && !header.isBlank()) {
            sb.append(FLAG_HEADER).append(" \"").append(header).append("\" ");
        }
        if (body != null && !body.isBlank()) {
            sb.append(FLAG_BODY).append(" '").append(body).append("' ");
        }

        sb.append("\"").append(url).append("\"");
        return sb.toString();
    }
}