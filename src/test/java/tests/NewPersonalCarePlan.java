package tests;

import models.CarePlan;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CarePlanCreateLoginPage;

import java.util.concurrent.TimeUnit;

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
        CarePlan carePlan = new CarePlan();
        carePlan.setHealthDirectiveOther("HelloWorld");
        carePlan.setLocation("HelloWorld");
        carePlan.setToiletScheduleDescription("HelloWorld");
        carePlan.setBathShowerAssistProvidedByName("HelloWorld");
        carePlan.setPreparingMealsProblemManagingTips("HelloWorld");
        carePlan.setPerformedByOthersName("HelloWorld");
        carePlan.setLightHouseworkProblemManagingTips("HelloWorld");
        carePlan.setCaregiverFamilyTransportsName("HelloWorld");
        carePlan.setFinancesPerformedByOthersNam("HelloWorld");
        carePlan.setShoppingProblemManagingTips("HelloWorld");
        carePlan.setEquipmentUsedOtherTips("HelloWorld");
        carePlan.setPainLocationComment("HelloWorld");
        carePlan.setPainLocationComment("HelloWorld");
        carePlan.setPainTriggerdByComment("HelloWorld");
        carePlan.setWoundCareBy("HelloWorld");
        carePlan.setOtherTreatmentsName("HelloWorld");
        carePlan.setInjectionsBy("HelloWorld");
        carePlan.setOtherEquipmentName("HelloWorld");
        carePlan.setEquipmentCaredForBy("HelloWorld");
        carePlan.setCulturalConsiderations("No Problem");
        carePlan.setCaregiverandConsumerStrengths("No Problem");
        carePlan.setImportantHealthMedicalConsiderations("No Problem");
        carePlan.setHealthDirectiveComments("No Problem");
        carePlan.setBedPositioningComments("No Problem");
        carePlan.setMovingTransferringComments("No Problem");
        carePlan.setWalkingAmbulationComments("No Problem");
        carePlan.setGettingDressedComments("No Problem");
        carePlan.setEatingDrinkingComments("No Problem");
        carePlan.setToiletUseComments("No Problem");
        carePlan.setBathingShoweringComments("No Problem");
        carePlan.setBrushingProblemManagementTips("No Problem");
        carePlan.setBrushingComments("No Problem");
        carePlan.setPreparingMealsComments("No Problem");
        carePlan.setLightHouseworkComments("No Problem");
        carePlan.setTransportationComments("No Problem");
        carePlan.setFinancesComments("No Problem");
        carePlan.setPhoneUseComments("No Problem");
        carePlan.setShoppingComments("No Problem");
        carePlan.setEquipmentUsedTipsForManagingComment("No Problem");
        carePlan.setMedicationPrepOrganizationComments("No Problem");
        carePlan.setVisionComments("No Problem");
        carePlan.setHearingComments("No Problem");
        carePlan.setCommunicationComments("No Problem");
        carePlan.setPainComment("No Problem");
        carePlan.setTreatmentNotesComments("No Problem");
        carePlan.setEquipmentManagementNotesComments("No Problem");
        carePlan.setSafetyNeedsNotesComments("No Problem");
        carePlan.setuTAComments("No Problem");
        carePlan.setDischargePlanNotesComments("No Problem");
        page.carePlan(carePlan);
    }

    @AfterClass
    public void quitBrouser() {
        driver.quit();
    }
}