import org.apache.http.NameValuePair;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(64);
        server.serverStart(9999);
        List<NameValuePair> params = server.getQueryParams("https://www.google.com/search?q=netology+ru&sxsrf=AOaemvKyC1kGkaS6Dc7Nu0MTN-XvGdCFeg%3A1638227328253&ei=gF2lYbL1DoOarwTtyLaYDw&ved=0ahUKEwiytdiv2L70AhUDzYsKHW2kDfMQ4dUDCA4&uact=5&oq=netology+ru&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEIAEMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yCQgAEMkDEBYQHjIFCAAQgAQyAggmOgcIABBHELADOgQIIxAnOggIABCABBCxAzoLCAAQgAQQsQMQgwE6BwgAELEDEEM6BAgAEEM6CggAELEDEIMBEEM6BwgjEOoCECc6CgguEMcBEKMCECc6DgguEIAEELEDEMcBEKMCOg4ILhCABBCxAxDHARDRAzoICAAQsQMQgwE6BQguEIAEOggILhCABBCxAzoLCC4QgAQQsQMQgwE6DQguELEDEMcBENEDEEM6DgguEIAEELEDEMcBEK8BOgoILhDHARCjAhBDOgsILhCABBDHARCvAToKCAAQgAQQhwIQFEoECEEYAFCBCVifL2C0M2gKcAJ4AIABVogBjgqSAQIxOJgBAKABAbABCsgBCMABAQ&sclient=gws-wiz");
        for (NameValuePair param : params) {
            System.out.println(param.getName() + " : " + param.getValue());
        }
    }
}

