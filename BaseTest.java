import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {


  public  static void main(String[]args)
  {
           System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
           WebDriver driver=new ChromeDriver();

           driver.get("https://www.lcwaikiki.com/tr-TR/TR");




    }


}
