public class Main {
    public static void main(String[] args) {
        Browser browser1 = new Chrome();
        Browser browser2 = new Firefox();
        browser1.goToPage("https://www.google.com/intl/pl/chrome");
        browser2.goToPage("https://www.mozilla.org/pl/firefox/new");
    }
}
