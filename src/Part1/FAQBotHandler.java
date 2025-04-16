package Part1;

class FAQBotHandler implements SupportHandler {
    private SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled: " + issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            System.out.println("Cannot handle: " + issue);
        }
    }
}