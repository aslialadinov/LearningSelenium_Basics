package seleniumBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

    public static  void main(String[] args) {
        //1. Open the browser
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ibra\\IdeaProjects\\LearningSeleniumbasics\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
    }
}
