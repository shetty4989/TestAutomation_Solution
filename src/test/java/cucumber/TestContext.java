package cucumber;

import managers.DataSheetManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

import java.util.HashMap;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private DataSheetManager dataSheetManager;
    public HashMap<String, HashMap<String,String>> dataMap;



    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        dataSheetManager = new DataSheetManager();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }
    public DataSheetManager getDataSheetManager() {
        return dataSheetManager;
    }
}