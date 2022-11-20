public class Firefox implements Browser{
    protected String url;
    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Firefox url: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Page has refreshed.");
    }

    @Override
    public void bookmarkPage() {
        System.out.println("Page was bookmarked!");
    }
}
