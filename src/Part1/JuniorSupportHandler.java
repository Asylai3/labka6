package Part1;
public class JuniorSupportHandler implements SupportHandler {
    private SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Handled: " + issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            System.out.println("Cannot handle: " + issue);
        }
    }
}
