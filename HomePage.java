import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage {
    LoginButton loginButton;
    SearchBox searchBox;
    By cartCountUpLocator = By.id("spanCart");
    By sepeteGitLocator = By.className("header-icon-label");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }
    public LoginButton loginButton(){

        return this.loginButton;
    }

    public SearchBox searchBox()
    {
        return this.searchBox;

    }

    public boolean İsProductCountUp() {
        return getCartCount() > 0;
    }


    public void gotoCart() {
        click(sepeteGitLocator);

    }

    private int getCartCount() {
        String count = find(cartCountUpLocator).getText();
        return Integer.parseInt(count);
    }
}