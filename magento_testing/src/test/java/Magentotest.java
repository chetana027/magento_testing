import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magentotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.magento.com");
        Welcome w=new Welcome(driver);
        w.clickOnMyAccount();
        Login l=new Login(driver);
        l.typeEmail("chetanapatil4806@gmail.com");
        l.typePassword("welcome@123");
        l.clickOnLogin();
        Home h=new Home(driver);
        h.clickOnLogout();
        driver.quit();

	}

}
