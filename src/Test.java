import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class Test {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://moodle.cestarcollege.com/moodle/login/index.php");
        WebElement element=driver.findElement(By.xpath("//input[@name='username']"));
        element.sendKeys("750127");
        WebElement element1=driver.findElement(By.xpath("//input[@name='password']"));
        element1.sendKeys("****"); //enter actual password
        driver.findElement(By.id("loginbtn")).click();
        driver.findElement(By.xpath("//span[@class='userbutton']")).click();
        driver.findElement(By.id("actionmenuaction-6")).click();
        driver.quit();

        /*OperaDriver driver1 = new OperaDriver();
        driver1.get("https://moodle.cestarcollege.com/moodle/login/index.php");
        WebElement elementS = driver1.findElement(By.xpath("//input[@name='username']"));
        elementS.sendKeys("750127");
        WebElement elementSS=driver1.findElement(By.xpath("//input[@name='password']"));
        elementSS.sendKeys("****"); //enter actual password
        driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver1.findElement(By.id("loginbtn")).click();
        driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver1.findElement(By.xpath("//span[@class='userbutton']")).click();
        driver1.findElement(By.id("actionmenuaction-6")).click();
        driver1.quit();*/

    }
}