import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

class BrowserHistory {

    Deque<String> siteList = new LinkedList<>();

    public void visitSite(String site) {
        siteList.addFirst(site);
    }
    public String back(int steps) {
        if (steps >= siteList.size()) {
            return null;
        } else {
            return siteList.stream().skip(steps).findFirst().orElse(null);
        }
    }
    public Deque<String> getHistory() {
        return siteList;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }
}