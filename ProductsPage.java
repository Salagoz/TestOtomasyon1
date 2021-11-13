import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage  {
    By shippingOptionLocator = By.className("breadcrumb");
    By productNameLocator = By.className("title");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public Boolean İsOnProductPage() {

        return isDisplayed(shippingOptionLocator);
    }


    public void selectProduct(int i) {
        getAllproducts().get(i).click();
    }

        private List<WebElement> getAllproducts() {
            return findAll(productNameLocator);
        }
    }


