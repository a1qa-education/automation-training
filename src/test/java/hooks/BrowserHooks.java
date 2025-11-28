package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Browser;

public class BrowserHooks {
    private static final String URL = "https://the-internet.herokuapp.com/";

    @Before(value = "@ui")
    public void setUpBrowser() {
        Browser.getInstance().get(URL);
    }

    @After(value = "@ui")
    public void tearDownBrowser() {
        Browser.quitDriver();
    }
}
