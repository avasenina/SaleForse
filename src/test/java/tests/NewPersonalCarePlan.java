package tests;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import models.CarePlan;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CarePlanCreateLoginPage;
import java.util.concurrent.TimeUnit;

@Log4j2
@Data
public class NewPersonalCarePlan {
    private ChromeDriver driver;
    CarePlanCreateLoginPage page;

    @BeforeClass
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "src/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://seniorlink--staging.cs41.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fseniorlink--staging.lightning.force.com%252Flightning%252Fo%252FPersonal_Care_Plan__c%252Fnew%253Fcount%253D3%2526ws%253D%25252Flightning%25252Fr%25252FOpportunity%25252F0065500000CJiqqAAD%25252Fview%2526nooverride%253D1%2526useRecordTypeCheck%253D1%2526navigationLocation%253DRELATED_LIST%2526uid%253D1567436538193");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("aqa1@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("Password02");
        driver.findElement(By.id("Login")).click();
    }

    @Test
    public void openSaleForce() {
      page = new CarePlanCreateLoginPage(driver);

        CarePlan carePlan = CarePlan.builder()
                .healthDirectiveOther("HelloWorld")
                .location("HelloWorld")
                .toiletScheduleDescription("HelloWorld")
                .bathingShoweringComments("HelloWorld")
                .preparingMealsProblemManagingTips("HelloWorld")
                .performedByOthersName("HelloWorld")
                .lightHouseworkProblemManagingTips("HelloWorld")
                .caregiverFamilyTransportsName("HelloWorld")
                .financesPerformedByOthersNam("HelloWorld")
                .shoppingProblemManagingTips("HelloWorld")
                .equipmentUsedOtherTips("HelloWorld")
                .painLocationComment("HelloWorld")
                .painTriggerdByComment("HelloWorld")
                .woundCareBy("HelloWorld")
                .otherTreatmentsName("HelloWorld")
                .injectionsBy("HelloWorld")
                .otherEquipmentName("HelloWorld")
                .equipmentCaredForBy("HelloWorld")
                .culturalConsiderations("No Problem")
                .caregiverandConsumerStrengths("No Problem")
                .importantHealthMedicalConsiderations("No Problem")
                .healthDirectiveComments("No Problem")
                .bedPositioningComments("No Problem")
                .movingTransferringComments("No Problem")
                .walkingAmbulationComments("No Problem")
                .gettingDressedComments("No Problem")
                .eatingDrinkingComments("No Problem")
                .toiletUseComments("No Problem")
                .bathingShoweringComments("No Problem")
                .brushingProblemManagementTips("No Problem")
                .brushingComments("No Problem")
                .preparingMealsComments("No Problem")
                .lightHouseworkComments("No Problem")
                .transportationComments("No Problem")
                .financesComments("No Problem")
                .phoneUseComments("No Problem")
                .shoppingComments("No Problem")
                .equipmentUsedTipsForManagingComment("No Problem")
                .medicationPrepOrganizationComments("No Problem")
                .visionComments("No Problem")
                .hearingComments("No Problem")
                .communicationComments("No Problem")
                .painComment("No Problem")
                .treatmentNotesComments("No Problem")
                .equipmentManagementNotesComments("No Problem")
                .safetyNeedsNotesComments("No Problem")
                .uTAComments("No Problem")
                .dischargePlanNotesComments("No Problem")
                .painSourceComment("No Problem")
                .build();

        log.error(carePlan);
        log.info("Запускаю тест");
        log.warn("Something went wrong");
      
        page.carePlan(carePlan);
    }

    @AfterClass
    public void quitBrouser() {
        driver.quit();
    }
}