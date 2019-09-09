package pages;

import elements.TextArea;
import elements.TextField;
import models.CarePlan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CarePlanCreateLoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public CarePlanCreateLoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public void carePlan(CarePlan carePlan) {
        new TextField("Health Directive Other",driver).typeText(carePlan.getHealthDirectiveOther());
        new TextField("Location",driver).typeText(carePlan.getLocation());
        new TextField("Toilet Schedule Description",driver).typeText(carePlan.getToiletScheduleDescription());
        new TextField("Bath/Shower Assist Provided By Name",driver).typeText(carePlan.getBathShowerAssistProvidedByName());
        new TextField("Preparing Meals Problem Managing Tips",driver).typeText(carePlan.getPreparingMealsProblemManagingTips());
        new TextField("Performed By Others Name",driver).typeText(carePlan.getPerformedByOthersName());
        new TextField("Light Housework Problem Managing Tips",driver).typeText(carePlan.getLightHouseworkProblemManagingTips());
        new TextField("Caregiver/Family Transports Name",driver).typeText(carePlan.getCaregiverFamilyTransportsName());
        new TextField("Finances Performed By Others Name",driver).typeText(carePlan.getFinancesPerformedByOthersNam());
        new TextField("Shopping Problem Managing Tips",driver).typeText(carePlan.getShoppingProblemManagingTips());
        new TextField("Equipment Used Other Tips",driver).typeText(carePlan.getEquipmentUsedOtherTips());
        new TextField("Pain Location Comment",driver).typeText(carePlan.getPainLocationComment());
        new TextField("Pain Source Comment",driver).typeText(carePlan.getPainSourceComment());
        new TextField("Pain Triggered By Comment",driver).typeText(carePlan.getPainTriggerdByComment());
        new TextField("Wound Care By",driver).typeText(carePlan.getWoundCareBy());
        new TextField("Other Treatments Name",driver).typeText(carePlan.getOtherTreatmentsName());
        new TextField("Injections By",driver).typeText(carePlan.getInjectionsBy());
        new TextField("Other Equipment Name",driver).typeText(carePlan.getOtherEquipmentName());
        new TextField("Equipment Cared For By",driver).typeText(carePlan.getEquipmentCaredForBy());
        new TextArea("Cultural Considerations",driver).typeText(carePlan.getCulturalConsiderations());
        new TextArea("Caregiver and Consumer Strengths",driver).typeText(carePlan.getCaregiverandConsumerStrengths());
        new TextArea("Important Health/Medical Considerations",driver).typeText(carePlan.getImportantHealthMedicalConsiderations());
        new TextArea("Health Directive Comments",driver).typeText(carePlan.getHealthDirectiveComments());
        new TextArea("Bed Positioning Comments",driver).typeText(carePlan.getBedPositioningComments());
        new TextArea("Moving/Transferring Comments",driver).typeText(carePlan.getMovingTransferringComments());
        new TextArea("Walking/Ambulation Comments",driver).typeText(carePlan.getWalkingAmbulationComments());
        new TextArea("Getting Dressed Comments",driver).typeText(carePlan.getGettingDressedComments());
        new TextArea("Eating/Drinking Comments",driver).typeText(carePlan.getEatingDrinkingComments());
        new TextArea("Toilet Use Comments",driver).typeText(carePlan.getToiletUseComments());
        new TextArea("Bathing/Showering Comments",driver).typeText(carePlan.getBathingShoweringComments());
        new TextArea("Brushing Problem Management Tips",driver).typeText(carePlan.getBrushingProblemManagementTips());
        new TextArea("Brushing Comments",driver).typeText(carePlan.getBrushingComments());
        new TextArea("Preparing Meals Comments",driver).typeText(carePlan.getPreparingMealsComments());
        new TextArea("Light Housework Comments",driver).typeText(carePlan.getLightHouseworkComments());
        new TextArea("Transportation Comments",driver).typeText(carePlan.getTransportationComments());
        new TextArea("Finances Comments",driver).typeText(carePlan.getFinancesComments());
        new TextArea("Phone Use Comments",driver).typeText(carePlan.getPhoneUseComments());
        new TextArea("Shopping Comments",driver).typeText(carePlan.getShoppingComments());
        new TextArea("Equipment Used/Tips For Managing Comment",driver).typeText(carePlan.getEquipmentUsedTipsForManagingComment());
        new TextArea("Medication Prep/Organization Comments",driver).typeText(carePlan.getMedicationPrepOrganizationComments());
        new TextArea("Vision Comments",driver).typeText(carePlan.getVisionComments());
        new TextArea("Hearing Comments",driver).typeText(carePlan.getHearingComments());
        new TextArea("Communication Comments",driver).typeText(carePlan.getCommunicationComments());
        new TextArea("Pain Comment",driver).typeText(carePlan.getPainComment());
        new TextArea("Treatment Notes/Comments",driver).typeText(carePlan.getTreatmentNotesComments());
        new TextArea("Equipment Management Notes/Comments",driver).typeText(carePlan.getEquipmentManagementNotesComments());
        new TextArea("Safety Needs Notes/Comments",driver).typeText(carePlan.getSafetyNeedsNotesComments());
        new TextArea("UTA Comments",driver).typeText(carePlan.getuTAComments());
        new TextArea("Discharge Plan Notes/Comments",driver).typeText(carePlan.getDischargePlanNotesComments());
    }
}

