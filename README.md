Tests to help complete the "Personal Care Plan" (SalesForce progect)
====================================================================
General page: <https://seniorlink--staging.lightning.force.com/lightning/r/Opportunity/0065500000CJiqqAAD/view>
Test-form: <https://seniorlink--staging.cs41.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fseniorlink--staging.lightning.force.com%252Flightning%252Fo%252FPersonal_Care_Plan__c%252Fnew%253Fcount%253D3%2526ws%253D%25252Flightning%25252Fr%25252FOpportunity%25252F0065500000CJiqqAAD%25252Fview%2526nooverride%253D1%2526useRecordTypeCheck%253D1%2526navigationLocation%253DRELATED_LIST%2526uid%253D1567436538193>
---------------------------------------------------------------------------------------------------

INSTALLATION
For the tests to work correctly, make sure the release file is unpacked. You will see the following files and directories:
/elements/Textarea
/elements/TextField
/models/CarePlan
/pages/CarePlanCreateLoginPage
/ tests/NewPersonalCarePlan
/resources/testng.xml
/target/pom.xml
/target/README.md

REQUIREMENTS
The minimum requirement is:
1) library versions must be updated (comand: mvn versions:use-latest-versions)
2) Download and use in this project "chromedriver.exe"

START OF TESTS:
This test  works with a command line tool called "Terminal".
For start on command line, type in the following command: mvn clean test
To run specific tests need to use command: mvn -Dtest=NewPersonalCarePlan test
To run specific mathod need to use command: mvn -Dtest=TestCircle#carePlan test
To change properties: mvn test -DHelloWorld=HiEarth

