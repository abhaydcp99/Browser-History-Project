package browserhistory;

public class BrowserHistoryDemo {
    private HistoryNodeDemo current;

    public void visitPage(String url) {
        HistoryNodeDemo newNode = new HistoryNodeDemo(url);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        System.out.println("Visited: " + url);
    }

    public void moveBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved to previous page: " + current.url);
        } else {
            System.out.println("No previous page available.");
        }
    }

    public void moveForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved to next page: " + current.url);
        } else {
            System.out.println("No next page available.");
        }
    }

    public void displayCurrentPage() {
        if (current != null) {
            System.out.println("Current Page: " + current.url);
        } else {
            System.out.println("No page visited yet.");
        }
    }

    public void clearHistory() {
        current = null;
        System.out.println("Browser history cleared.");
    }
}
