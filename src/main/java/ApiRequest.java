import com.nauryzbay.requestforge.HttpMethod;
public class ApiRequest {
    private final HttpMethod method;
    private final String url;
    private final String header;
    private final String body;

    ApiRequest( HttpMethod method, String url, String header, String body){

        this.method = method;
        this.url = url;
        this.header = header;
        this.body = body;

    }

    public HttpMethod getMethod(){
        return method;
    }

    public String getUrl(){
        return url;
    }

    public String getHeader(){
        return header;
    }

    public String getBody(){
        return body;
    }

    public String toString(){
        return "ApiRequest" + method+ " ," + url +", header" + header+ ", body=" + body;
    }
}
