import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class TestService {

    @GET
    public String getHello() {
        return "Hello there";
    }

}
