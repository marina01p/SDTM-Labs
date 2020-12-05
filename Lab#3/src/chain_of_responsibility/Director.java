package chain_of_responsibility;

public class Director extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director received your good review!");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
