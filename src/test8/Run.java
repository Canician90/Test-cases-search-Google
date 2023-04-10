   package test8; 


import org.openqa.selenium.By;  
    import org.openqa.selenium.WebDriver;  
    import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  
      
    public class Run{  
    	public static void main(String[] args) throws InterruptedException {
     
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
          
    // Launch website  
        driver.navigate().to("http://www.google.com/");  
        driver.findElement(By.xpath ("//*[@id=\"L2AGLb\"]/div")).click();
              
        // Click on the search text box and send value  
        driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
              
        // Click on the search button  
        driver.findElement(By.className("gNO89b")).click();  
          
        }  
      
    }  