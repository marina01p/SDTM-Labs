package chain_of_responsibility;

public class Director extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.GOOD_REVIEW) {
            System.out.println("Director received your good ");
            System.out.println("review! Thank you for your time!");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
