import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CartPage extends BasePage {
    By productNameLocator = new By.ByCssSelector("rd-cart-item-code ");

    public CartPage(WebDriver driver) {
        super(driver);
    }


    private List<WebElement> getProducts() {
        return findAll(productNameLocator);
    }

    public boolean checkIfProductAdded() {
        {
            return getProducts().size() > 0 ;
        }
    }
}

