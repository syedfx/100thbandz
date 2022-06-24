package pages.petstore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandingPage extends base.CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(LandingPage.class);

    @FindBy(xpath = "//*[@id=\"Content\"]/p[1]/a")
    private WebElement landingPage;


    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLink(){
        click(landingPage);
        LOG.info("Click to enter was successful");
        System.out.println("click to enter was successful");

    }

}
