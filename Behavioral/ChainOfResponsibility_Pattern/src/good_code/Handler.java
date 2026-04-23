package good_code;

// Handler
public abstract class Handler {

    protected Handler next;

    // will be used for chaining
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(Request request);
}
