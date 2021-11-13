import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.OrderWith;


public class Test_Add_Product_To_Cart {
    LoginPage loginPage;
    HomePage homepage;
    ProductsPage productsPage;
    ProductDetailPage ProductDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void GirisYap() {
        homepage.loginButton();
        Assertions.assertTrue(loginPage.İsOnLoginPage(), "Page Not Found");
    }

    @Test
    @Order(2)
    public void DahaFazlaUrunGor() {

        ProductsPage productPage;
        productPage.seeMore();
        Assertions.assertTrue(productPage.İsOnProductPage(), "Page Not Found");

        @Test
        @Order(3)
        public static void Ürün_Arama() {
            homepage.searchBox().search("Pantolon");
            Assertions.asertTrue(productsPage.İsOnProductPage(), "Not on product page");

        }
        @Test
        @Order(4)
        public void ürüne_tıkla() {
            productsPage.selectProduct(1);
            Assertions.assertTrue(ProductDetailPage.isOnProductDetailPage(), "Not On Product Detail Page");

        }
        @Test
        @Order(5)
        public void SepeteEkle() {
            ProductDetailPage.addToCart();
            Assertions.assertTrue(HomePage.İsProductCountUp(), "No products added to cart");

        }
        @Test
        @Order(6)
        public void sepetegit () {

            homepage.gotoCart();
            Assertions.assertTrue(cartPage.checkIfProductAdded(), "No products added to cart");

        }


    }
}
