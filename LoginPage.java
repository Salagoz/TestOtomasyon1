import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By henuzuyedegilmisinLocator = By.className("blue");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean İsOnLoginPage(){
        return isDisplayed(henuzuyedegilmisinLocator);

    }
}
