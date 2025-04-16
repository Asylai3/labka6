package Part1;
public class Main {
    public static void main(String[] args) {
        FAQBotHandler faq = new FAQBotHandler();
        JuniorSupportHandler junior = new JuniorSupportHandler();
        SeniorSupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior);
        junior.setNext(senior);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            faq.handle(issue);
        }
    }
}