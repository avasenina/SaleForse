package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Log4j2
@Builder
public class CarePlan {
    String healthDirectiveOther;
    String location;
    String toiletScheduleDescription;
    String bathShowerAssistProvidedByName;
    String preparingMealsProblemManagingTips;
    String performedByOthersName;
    String lightHouseworkProblemManagingTips;
    String caregiverFamilyTransportsName;
    String financesPerformedByOthersNam;
    String shoppingProblemManagingTips;
    String equipmentUsedOtherTips;
    String painLocationComment;
    String painSourceComment;
    String painTriggerdByComment;
    String woundCareBy;
    String otherTreatmentsName;
    String injectionsBy;
    String otherEquipmentName;
    String equipmentCaredForBy;

    String culturalConsiderations;
    String caregiverandConsumerStrengths;
    String importantHealthMedicalConsiderations;
    String healthDirectiveComments;
    String bedPositioningComments;
    String movingTransferringComments;
    String walkingAmbulationComments;
    String gettingDressedComments;
    String eatingDrinkingComments;
    String toiletUseComments;
    String bathingShoweringComments;
    String brushingProblemManagementTips;
    String brushingComments;
    String preparingMealsComments;
    String lightHouseworkComments;
    String transportationComments;
    String financesComments;
    String phoneUseComments;
    String shoppingComments;
    String equipmentUsedTipsForManagingComment;
    String medicationPrepOrganizationComments;
    String visionComments;
    String hearingComments;
    String communicationComments;
    String painComment;
    String treatmentNotesComments;
    String equipmentManagementNotesComments;
    String safetyNeedsNotesComments;
    String uTAComments;
    String dischargePlanNotesComments;
}
