package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextArea {
    WebDriver driver;
    WebDriverWait wait;
    String label;
    WebElement area;

    public TextArea(String label, WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        this.label = label;
        area = driver.findElement(By.xpath("//span[text()='"+label+"')]/../..//following-sibling::textarea"));
    }

    public TextArea typeText(String text) {
        area.clear();
        wait.until(ExpectedConditions.visibilityOf(area));
        System.out.println(String.format("Waiting text '%s' into Input '%s'", text, label));
        area.sendKeys(text);
        return this;
    }
}
