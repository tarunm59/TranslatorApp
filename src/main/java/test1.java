import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class test1
{
    String slang;
    String endlang;
    String input;
    public test1(String slang,String endlang,String input)
    {
        this.slang = slang;
        this.endlang = endlang;
        this.input = input;
    }
    public String compute() throws Exception
    {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://translate.google.com/");
        WebElement menu1 = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.ccvoYb > div.aCQag > c-wiz > div:nth-child(2) > button"));
        menu1.click();
        WebElement lag1b = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.hRFt4b > c-wiz > div.OoYv6d > div > div.RstnCb.sG5QRb > input"));
        lag1b.sendKeys(this.slang);
        driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.hRFt4b > c-wiz > div.OoYv6d > div > div.Y3WOZb.Ab7Lhd > div > div.ordo2 > div.PxXj2d > span")).click();
      WebElement menu2= driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.ccvoYb > div.aCQag > c-wiz > div:nth-child(5) > button"));
       for(int i = 0;i<=2;i++)
       {
           menu2.click();
       }
       WebElement lag2bar = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.hRFt4b > c-wiz > div.ykTHSe > div > div.RstnCb.sG5QRb > input"));
       lag2bar.sendKeys(this.endlang);
      WebElement finalclick = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.hRFt4b > c-wiz > div.ykTHSe > div > div.Y3WOZb.Ab7Lhd > div > div.ordo2 > div.PxXj2d > span"));
      finalclick.click();
      finalclick.click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      WebElement textarea = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.ccvoYb > div.AxqVh > div.OPPzxe > c-wiz.rm1UF.UnxENd > span > span > div > textarea"));
      textarea.click();
      textarea.sendKeys(this.input);
      textarea.sendKeys(" ");
      WebElement finaltext = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.WFnNle > c-wiz > div.OlSOob > c-wiz > div.ccvoYb > div.AxqVh > div.OPPzxe > c-wiz.P6w8m.BDJ8fb > div.dePhmb > div > div.J0lOec > span.VIiyi > span > span"));

      String returntext=finaltext.getText();
     driver.close();
      return(returntext);

    }
    public static void main(String[] args) throws Exception
    {
       Scanner read = new Scanner(System.in);
       System.out.println("Enter the Initial Language");
       String slang = read.nextLine();
        System.out.println("Enter the Final Language");
        String flang = read.nextLine();
        System.out.println("Enter the sentence in your initial language");
        String sentence = read.nextLine();
       test1 obj = new test1(slang,flang,sentence);
       System.out.println("Your final translation is:");
       System.out.println(obj.compute());





    }
}
