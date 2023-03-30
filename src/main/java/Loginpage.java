import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    FindBy(name = "username");
    WebElement username;


    FindBy(name = "password")
    WebElement password;

    FindBy(css = "Orangehrm- login-button");
    WebElement loginButton;

    public LoginPage(ChromeDriver){
        this.driver = driver;
        PageFactory.initElements(driver,  page this);
    }

    user




}
