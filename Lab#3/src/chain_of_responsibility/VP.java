package chain_of_responsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE) {
            if(request.getAmount() < 3) {
                System.out.println("VP received your bad review!");
            }
        }
    }
}
