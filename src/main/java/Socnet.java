public class Socnet {
    private Socnet socnet;

    private Socnet() {
    }

    public Socnet getInstance() {
        if (socnet == null) socnet = new Socnet();
        return socnet;
    }
}
