import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By sepeteEkleLocator = By.id("pd_add_to_cart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isOnProductDetailPage() {
        return isDisplayed(sepeteEkleLocator);
    }

    public void addToCart() {
        click(sepeteEkleLocator);
    }
}
