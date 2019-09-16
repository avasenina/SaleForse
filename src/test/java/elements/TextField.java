package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class TextField {
    WebElement element;
    WebDriver driver;
    WebDriverWait wait;
    String label;
    WebElement area;

    public TextField(String label, WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        this.label = label;
        element = driver.findElement(By.xpath("//span[text()='"+label+"']/../..//following-sibling::input"));
    }

    public TextField typeText(String text) {
        log.info("Поиск и рписание Текст-филдов");
        element.clear();
        wait.until(ExpectedConditions.visibilityOf(element));
        log.info("Ожидание появление введенного текста");
        element.sendKeys(text);
        return this;
    }
}
