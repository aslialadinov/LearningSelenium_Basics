package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication2 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
       // driver.get("https://google.com/");//one way to navigate to a browser
        driver.navigate().to("https://google.com/");



    }
}
