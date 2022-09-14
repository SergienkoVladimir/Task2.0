import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\libs\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://store.steampowered.com/");
        Boolean Display = driver.findElement(By.xpath("//div[@class='home_page_body_ctn ']")).isDisplayed();


        System.out.println("Element displayed is :"+Display);



    }
}
