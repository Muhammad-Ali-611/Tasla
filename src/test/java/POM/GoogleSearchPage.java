package POM;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class GoogleSearchPage {
    private final WebDriver driver;
    private GSPFluentInterface gspfi;

    public class GSPFluentInterface {
        private GoogleSearchPage gsp;

        public GSPFluentInterface(GoogleSearchPage googleSearchPage) {
            gsp = googleSearchPage;
        }

        public GSPFluentInterface clickSearchButton() {
            gsp.searchButton.click();
            return this;
        }

        public GSPFluentInterface setSearchString( String sstr ) {
            clearAndType( gsp.searchField, sstr );
            return this;
        }
    }

    @FindBy(id = "gbqfq") private WebElement searchField;
    @FindBy(id = "gbqfb") private WebElement searchButton;
    public GoogleSearchPage(WebDriver driver) {
        gspfi = new GSPFluentInterface( this );
        this.get(); // If load() fails, calls isLoaded() until page is finished loading
        PageFactory.initElements(driver, this); // Initialize WebElements on page
    }

    public GSPFluentInterface withFluent() {
        return gspfi;
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void setSearchString( String sstr ) {
        clearAndType( searchField, sstr );
    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue("Google search page is not yet loaded.", isSearchFieldVisible() );
    }

    @Override
    protected void load() {
        if ( isSFieldPresent ) {
            Wait<WebDriver> wait = new WebDriverWait( driver, Duration.ofSeconds(3) );
            wait.until( visibilityOfElementLocated( By.id("gbqfq") ) ).click();
        }
    }
}
