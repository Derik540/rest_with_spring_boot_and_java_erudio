package erudio.com;

public class Greeting {

    private final long id;
    private final String counter;

    public Greeting(long id, String counter) {
        this.id = id;
        this.counter = counter;
    }

    public long getId() {
        return id;
    }

    public String getCounter() {
        return counter;
    }

    

}
