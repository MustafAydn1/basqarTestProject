package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class fromContentPOM extends Parent {
    WebElement myElement;
    List<WebElement> myListName;

    public fromContentPOM() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "ms-add-button.ng-star-inserted")
    private WebElement btnAdd;

    @FindAll({
            @FindBy(css = "ms-delete-button.ng-star-inserted")
    })
    private List<WebElement> btndeletes;


    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement inputSearchName;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement inputSearchCode;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']/button)[1]")
    private WebElement afterSearchDelete;

    @FindBy(xpath = "(//ms-delete-button[contains(@class,'ng-star')]/button)[1]")
    private  WebElement afterSearchBudgExclDel;


    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement btnSearch;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement succesAlert;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement errorAlert;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']/button)[1]")
    private WebElement btncityDelete;

    @FindBy(xpath = "(//span[text()='Country'])[1]")
    private WebElement inputCityCountrySearch;

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement btnSalaryEdit;

    @FindBy(xpath = "(//mat-select/div/div)[1]")
    private WebElement searchSubCat;

    @FindAll({
            @FindBy(xpath = "//div[@role='listbox']/mat-option")
    })
    private List<WebElement> optionSearchSubCat;

    @FindBy(xpath = "(//mat-form-field/div)[2]//input")
     private WebElement nameSerchSlryCon;

    @FindBy(xpath = "(//mat-form-field/div)[3]//input")
    private WebElement keySerchSlryCon;

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement editAfterSearch;


    @FindBy(xpath = "//mat-form-field//input")
    private WebElement inputSearchNameSlry;

    @FindBy(xpath = "(//mat-form-field/div)[2]")
    private  WebElement inputSaerchUserType;

    @FindAll({
            @FindBy(xpath = "//mat-option/span")
    })
    private List<WebElement> userTypList;
//******************************************
    @FindBy(xpath = "(//mat-form-field//input)[1]")
     private WebElement descrptModfr;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement variableModfr;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement integratModfr;

    @FindBy(xpath = "(//mat-form-field//input)[4]")
    private WebElement priortyModfr;

    @FindBy(xpath = "(//mat-form-field//input)[5]")
    private WebElement amaountModfr;

    @FindBy (xpath = "(//mat-select/div)[1]")
    private WebElement modfrType;

    @FindAll({
            @FindBy(xpath = "//mat-option/span")
    })
    private List<WebElement> listModfrsType;

    @FindBy (xpath = "(//mat-select/div)[2]")
    private WebElement valueTypeModfr;


@FindAll({
        @FindBy(xpath = "//mat-option/span")
})
private List<WebElement> listvalueTypeModfrs;


  @FindBy(css = "div.px-16.px-mat-8>button")
  private WebElement backButton;

  @FindBy(xpath = "(//mat-form-field/div)[1]//input")
  private WebElement searchDesctModfr;

    @FindBy(xpath = "(//mat-form-field/div)[2]//input")
    private WebElement searchVariableModfr;

    @FindBy(xpath = "(//span[text()='Modifier Type'])[1]")
    private  WebElement searchModifrType;

    @FindBy(css = "ms-delete-button>button")
    private WebElement delete;

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement editCostCenter;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[1]")
    private WebElement deleteCostCenter;

    //****************Bank Account***************
    @FindBy(xpath = "(//mat-select)[1]")
    private WebElement searchCurrency;

    @FindAll({
            @FindBy(xpath = "//mat-option/span")
    })
    private List<WebElement> listCurrencyBankAcc;




    WebDriverWait wait=new WebDriverWait(driver,10);

    public void checkControl(String elementName,String Msg){

        switch (elementName){
            case "succesAlert":
                myElement=succesAlert;
                break;

            case "errorAlert" :
                myElement=errorAlert;
                break;

        }
wait.until(ExpectedConditions.textToBePresentInElement(myElement,Msg));
        Assert.assertTrue(myElement.getText().toLowerCase().contains(Msg.toLowerCase()));



    }




    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "btnAdd" :
                myElement=btnAdd;
                break;

            case "afterSearchDelete":
                myElement=afterSearchDelete;
                break;

            case "btnSearch" :
                myElement=btnSearch;
                break;

            case "inputCityCountrySearch":
                myElement=inputCityCountrySearch;
                break;

            case "btncityDelete":
                myElement=btncityDelete;
                break;

            case "btnSalaryEdit":
                myElement=btnSalaryEdit;
                break;

            case "searchSubCat":
                myElement=searchSubCat;
                break;

            case "editAfterSearch":
                myElement=editAfterSearch;
                break;

            case "backButton":
                myElement=backButton;
                break;

            case "delete":
                myElement=delete;
                break;

            case "editCostCenter":
                myElement=editCostCenter;
                break;

            case "deleteCostCenter":
                myElement=deleteCostCenter;
                break;

            case "afterSearchBudgExclDel":
                myElement=afterSearchBudgExclDel;
                break;


        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName,String value){

        switch (elementName) {
            case "inputSearchName":
                myElement=inputSearchName;
                break;

            case "inputSearchCode":
                myElement=inputSearchCode;
                break;


            case "nameSerchSlryCon":
                myElement=nameSerchSlryCon;
                break;

            case "keySerchSlryCon":
                myElement=keySerchSlryCon;
                break;

            case "inputSearchNameSlry":
                myElement=inputSearchNameSlry;
                break;

            case "descrptModfr":
                myElement=descrptModfr;
                break;

            case "variableModfr":
                myElement=variableModfr;
                break;

            case "integratModfr":
                myElement=integratModfr;
                break;

            case "priortyModfr":
                myElement=priortyModfr;
                break;

            case "amaountModfr":
                myElement=amaountModfr;
                break;

            case "searchVariableModfr":
                myElement=searchVariableModfr;
                break;

            case "searchDesctModfr":
                myElement=searchDesctModfr;
                break;



        }
        sendKeysFunction(myElement,value);
    }


    public void waitUntilNeed(String elementName){

        switch (elementName){
            case "afterSearchDelete":
                myElement=afterSearchDelete;
                break;

            case "editAfterSearch":
                myElement=editAfterSearch;
                break;

            case "btnAdd":
                myElement=btnAdd;
                break;

        }

        waitUntilVisible(myElement);
    }

    public  void needToScroll(String elementName) {

        switch (elementName) {
            case "inputSearchName":
                myElement=inputSearchName;
                break;


        }
        scrollToElement(myElement);
    }

    public void  selectOptions(String value,String elementName,String  listName){

        switch (elementName){
            case "inputSaerchUserType":
                myElement= inputSaerchUserType;
                break;

            case "modfrType":
                myElement= modfrType;
                break;

            case "valueTypeModfr":
                myElement= valueTypeModfr;
                break;

            case "searchModifrType":
                myElement= searchModifrType;
                break;

            case "searchCurrency":
                myElement= searchCurrency;
                break;




        }
        clickFunction(myElement);
       // myElement.clear();

        //   waitUntilNeed("userTypList");



            switch (listName){
                case "userTypList":
                    myListName=userTypList ;
                    break;

                case "listModfrsType":
                    myListName=listModfrsType ;
                    break;

                case "listvalueTypeModfrs":
                    myListName=listvalueTypeModfrs ;
                    break;

                case "listCurrencyBankAcc":
                    myListName=listCurrencyBankAcc ;
                    break;

        }

        for (int i = 0; i <myListName.size() ; i++) {
            if (myListName.get(i).getText().contains(value))
                myListName.get(i).click();
        }


    }















    public void select(String value) {

        for (WebElement option : optionSearchSubCat) {

            if (option.getText().contains(value)) {
                clickFunction(option);
                break;
            }
        }
    }







}
