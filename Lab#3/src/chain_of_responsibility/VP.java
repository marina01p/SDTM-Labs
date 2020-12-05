package chain_of_responsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.BAD_REVIEW) {
            if(request.getAmount() < 3) {
                System.out.println("VP received your bad review!");
                System.out.println("We are sorry to hear about ");
                System.out.println("your bad experience!");
                System.out.println("Thank you for your time!");
            }
        }
    }
}
