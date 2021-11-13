import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton extends BasePage{
    By emailLocator = By.id("LoginEmail");
    By passwordLocator = By.id("Password");
    By GirisYapLocator = By.id("loginLink");

    public LoginButton(WebDriver driver) {
        super(driver);
    }

    public void login(String text){

        type(emailLocator,text);
        type(passwordLocator,text);
        By girisyapLocator;
        click(GirisYapLocator);

    }


}
