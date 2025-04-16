package Part1;

public interface SupportHandler {
    void setNext(SupportHandler next);
    void handle(String issue);
}
