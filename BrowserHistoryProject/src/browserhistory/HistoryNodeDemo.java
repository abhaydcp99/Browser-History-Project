package browserhistory;

class HistoryNodeDemo {
    String url;
    HistoryNodeDemo prev, next;

    public HistoryNodeDemo(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

