import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Task2 {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\libs\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://store.steampowered.com/");
        Boolean Display = driver.findElement(By.xpath("//div[@class='home_page_body_ctn ']")).isDisplayed();
        Assert.assertEquals(Display,true,"Main page is not displayed");

        WebElement login = driver.findElement(By.xpath("//a[@class= 'global_action_link']"));
        login.click();
        String actualUrl="https://store.steampowered.com/login/?redir=&redir_ssl=1&snr=1_4_4__global-header";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        WebElement username=driver.findElement(By.xpath("//input[@class= 'newlogindialog_TextInput_2eKVn']"));
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        username.sendKeys("Vladimir@gmail.ru");
        password.sendKeys("123sdlsd");
        WebElement sign_in=driver.findElement(By.xpath("//button[@class= 'newlogindialog_SubmitButton_2QgFE']"));
        sign_in.click();
        Boolean loadingElement=driver.findElement(By.xpath("//div[@class= 'newlogindialog_LoadingContainer_OYHj3']")).isDisplayed();
        Assert.assertEquals(loadingElement,true,"loading element is not displayed");

        Boolean error = driver.findElement(By.xpath("//div[@class= 'newlogindialog_FormError_1Mcy9']")).isDisplayed();
        Assert.assertEquals(error,true,"Error message is not displayed");


    }
}
