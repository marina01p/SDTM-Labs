package chain_of_responsibility;

public class Request {

    private RequestType requestType;
    private int amount;

    public Request(RequestType requestType, int amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public int getAmount() {
        return amount;
    }
}
