package Part1;

class SeniorSupportHandler implements SupportHandler {
    public void setNext(SupportHandler next) {
    }

    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Handled: " + issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle: " + issue + " — escalate manually");
        }
    }
}