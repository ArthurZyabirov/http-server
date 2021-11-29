import org.apache.http.NameValuePair;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(64);
        server.serverStart(9999);
        List<NameValuePair> params = server.getQueryParams("https://stackoverflow.com/questions/43602883/how-to-parse-query-param-effectively-in-java");
        for (NameValuePair param : params) {
            System.out.println(param.getName() + " : " + param.getValue());
        }
    }
}

