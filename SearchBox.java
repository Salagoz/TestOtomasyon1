import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class SearchBox extends BasePage {
    By searchBoxLocator = By.id("arama");
    By submitButtonLocator = By.className("arama-buton");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitButtonLocator);
    }
}
