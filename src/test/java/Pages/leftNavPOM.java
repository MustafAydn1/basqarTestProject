package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 3.8) MUSTAFA BY………………. Yeni bir Position Salary oluşturun onu DUZENLEYIN (editleyin) ve onu
SILIN.
Human Resources > Setup > Position Salary
Yeni bir Positions oluşturun onu DUZENLEYIN (editleyin) ve onu SILIN.
Human Resources > Setup > Positions
 */
public class leftNavPOM extends Parent {
    WebElement myElement;

    public leftNavPOM() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement btnSetup1;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement btnParamtrs;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement btnCountries;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement btnCities;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private  WebElement btnHumanRsc;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHuman;

    @FindBy(xpath = "(//span[text()='Position Salary'])[1]")
    private WebElement btnPositionSlry;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement btneducation;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private  WebElement setupEducation;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private  WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Subjects']")
    private WebElement subjects;

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private  WebElement btnreports;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement btnReportSetup;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private  WebElement bntExcelTemplate;

    @FindBy(xpath = "//span[text()='Salary Constants']")
    private  WebElement btnSalaryCons;

    @FindBy(xpath = "//span[text()='Salary Types']")
    private  WebElement btnSalaryTypes;

    @FindBy(xpath = "//span[text()='Salary Modifiers']")
    private  WebElement btnSalaryModfrs;

    @FindBy(xpath = "//span[text()='Budget']")
    private  WebElement btnBudget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private  WebElement btnSetupBudget;

    @FindBy(xpath = "(//span[text()='Cost Centers'])[1]")
    private  WebElement btnCostCenter;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private  WebElement btnBankAccount;





    public void findElementAndClickFunction(String elementName) { //if you make static here, all up must be static

        switch (elementName) {

            case "btnBankAccount":
                myElement=btnBankAccount;
                break;

            case "btnCostCenter":
                myElement=btnCostCenter;
                break;

            case "btnSetupBudget":
                myElement=btnSetupBudget;
                break;

            case "btnBudget":
                myElement=btnBudget;
                break;


            case "btnSalaryModfrs":
                myElement=btnSalaryModfrs;
                break;

            case "btnSalaryTypes":
                myElement=btnSalaryTypes;
                break;

            case "btnSalaryCons":
                myElement=btnSalaryCons;
                break;

            case "btnreports":
                myElement=btnreports;
                break;

            case "btnReportSetup":
                myElement=btnReportSetup;
                break;

            case "bntExcelTemplate":
                myElement=bntExcelTemplate;
                break;

            case "subjects":
                myElement=subjects;
                break;

            case "btneducation":
                myElement = btneducation;
                break;

            case "setupEducation":
                myElement = setupEducation;
                break;

            case "subjectCategories":
                myElement = subjectCategories;
                break;

            case "btnHumanRsc":
                myElement = btnHumanRsc;
                break;

            case "setupHuman":
                myElement = setupHuman;
                break;

            case "btnPositionSlry":
                myElement = btnPositionSlry;
                break;

            case "btnParamtrs":
                myElement = btnParamtrs;
                break;

            case "btnSetup1":
                myElement = btnSetup1;
                break;

            case "btnCountries":
                myElement = btnCountries;
                break;

            case "btnCities":
                myElement = btnCities;
                break;



        }
        clickFunction(myElement);
    }
}