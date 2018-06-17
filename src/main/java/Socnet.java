import java.util.ArrayList;
import java.util.List;

public class Socnet {
    private Socnet socnet;

    private Socnet() {
    }

    public Socnet getInstance() {
        if (socnet == null) socnet = new Socnet();
        return socnet;
    }


    public List<User> findUsers(String searchString) {
        return new ArrayList<User>();
    }
}
