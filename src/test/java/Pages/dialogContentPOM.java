package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/*
3.3) MUSTAFA BY……….Create a country (name is SOMECOUNTRY )and create a city (choose a
SOMECOUNTRY from the country dropdown.)
Bir ülke oluşturun (adı SOMECOUNTRY) olsun ve bir şehir oluşturun (ülkeler
listesinden önce SOMECOUNTRY ülkesini seçin ve daha sonra bir sehir (ismini siz
belirleyip) oluşturun.
Amacınız burada oluşturduğunuz ülkeyi ve sehri silmek.
Ilk olarak ülkenizi silmeye calisin, ekranda HATA mesajini görmeniz gerekmekte. …..
 */
public class dialogContentPOM extends Parent {

    WebElement myElement;
    List<WebElement> myListName;

    public dialogContentPOM() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[starts-with(@id,'mat-input')])[1]")
    private WebElement inputUserName;

    @FindBy(xpath = "(//input[starts-with(@id,'mat-input')])[2]")
    private WebElement inputPassword;

    @FindBy(css = "div.mat-checkbox-inner-container")
    private WebElement clickCheckBox;

    @FindBy(css = "button[aria-label=LOGIN]")
    private WebElement btnLogin;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> btnGotIts;

    @FindBy(linkText = "Got it!")
    private WebElement btnGotIt;


    @FindBy(css = "ms-text-field[formcontrolname='name']>input") // if input,find a input tag
    private WebElement inputName;

    @FindBy(css = "ms-text-field[formcontrolname='code']>input") // if input,find a input tag
    private WebElement inputCode;

    @FindBy(css = "ms-save-button>button")
    private WebElement btnSave;

    @FindBy(xpath = "(//span[text()='Country'])[3]")
    private WebElement nameOfCountries;

    @FindAll({
            @FindBy(css = "span.mat-option-text")
    })
    private List<WebElement> optionCountries;

    @FindBy(xpath = " //span[text()=' Yes '] ")
    private WebElement btnYes;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement inputSalaryName;

    @FindBy(xpath = "(//ms-add-button/div/button)[2]")
    private WebElement btnsubCatAdd;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name']/input)[2]")
    private  WebElement newSubCatName;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='code']/input)[2]")
    private WebElement newSubCatCode;

    @FindBy(xpath = "(//ms-save-button/button)[2]")
    private WebElement newSubCatSave;

    @FindBy(xpath = "(//mat-select/div)[3]")
    private WebElement slcSubCat;


    @FindBy(xpath = "(//mat-select/div)[4]")
    private WebElement newSubStyle;


    @FindBy (xpath="(//div[@role='listbox']/*)[2]")
    private WebElement styleOption2;

    @FindBy(xpath = "(//div[@role='listbox']/*)[1]") // bu kısma Adam gibi select yap
    private WebElement newSubCatOption;


    @FindAll({
            @FindBy(xpath = "//mat-option/span")
    })
    private List<WebElement> newSubStyleOptions;

    @FindBy(css = "ms-integer-field>input")
    private WebElement excelPeriodCount;

    @FindBy(xpath = "(//ms-integer-field/input)[1]")
    private WebElement excelRow;

    @FindBy(xpath = "(//ms-integer-field/input)[2]")
    private WebElement excelCol;

    @FindBy(css = "ms-button>button")
    private WebElement addVersion;

    @FindBy(xpath = "(//ms-edit-button/button)[11]")
    private WebElement excelEdit;

    @FindBy(xpath = "(//ms-delete-button/button)[11]")
    private  WebElement excelDelete;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement nameSalaryCons;

    @FindBy(xpath = "//input[@data-placeholder='Valid From']")
    private WebElement validSalaryCons;

    @FindBy(xpath = "//div[text()=' 5 ']")
    private WebElement clickCalender;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement inputKey;

    @FindBy(xpath = "//ms-integer-field/input")
    private WebElement inputValue;

    @FindBy(xpath = "//mat-chip-list//input")
    private WebElement userTypSalary;

    @FindAll({
            @FindBy(xpath = "//mat-option/span")
    })
    private List<WebElement> userTypList;

    //********************Cost Centers***************************
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameCostCentr;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeCostCentr;

    @FindBy(xpath = "(//mat-select/div)[2]")
    private WebElement typeCostCenter;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    private List<WebElement> typeCostCentOptions;

    @FindBy(xpath = "(//ms-text-field/input)[3]")
    private WebElement orderNO;

    @FindBy(xpath = "//mat-chip-list//input")
    private WebElement expensAccout;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    private  List<WebElement> expensAccOptions;

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private  WebElement constantCostC;

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement keyCostCent;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement valueCostCent;

    //************Bank Account**********

    @FindBy(css = "ms-masked-text-field[formcontrolname='iban']>input")
    private WebElement ibanBankAccount;

    @FindBy(xpath = "(//mat-select/div)[3]")
    private WebElement currencyBanAcc;

    @FindAll({
    @FindBy(xpath = "//mat-option/span")
    })
    private List<WebElement> listCurrencyBankAcc;

    @FindBy(css = "ms-text-field[formcontrolname='integrationCode']>input")
    private  WebElement integrationCodeBank;












    public void waitUntilNeed(String elementName) {

        switch (elementName) {
            case "nameOfCountries":
                myElement = nameOfCountries;
                break;

            case "nameSalaryCons":
                myElement = nameSalaryCons;
                break;

            case "excelRow":
                myElement = excelRow;
                break;


        }

        waitUntilVisible(myElement);
    }


    public void findElementAndClickFunction(String elementName) { //if you make static here, all up must be static

        switch (elementName) {

            case "clickCheckBox":
                myElement = clickCheckBox;
                break;

            case "btnLogin":
                myElement = btnLogin;
                break;

            case "btnGotIt":
                //  if(btnGotIts.size()!=0) //if must be here.otherwise!
                //      return;
                myElement = btnGotIt;
                break;


            case "btnSave":
                myElement = btnSave;
                break;

            case "nameOfCountries":
                myElement = nameOfCountries;
                break;

            case "btnYes":
                myElement = btnYes;
                break;

            case "btnsubCatAdd":
                myElement = btnsubCatAdd;
                break;


            case "slcSubCat":
                myElement = slcSubCat;
                break;

            case "newSubCatSave":
                myElement = newSubCatSave;
                break;

            case "newSubStyle":
                myElement = newSubStyle;
                break;

            case "styleOption2":
                myElement = styleOption2;
                break;

            case "newSubCatOption":
                myElement = newSubCatOption;
                break;

            case "excelDelete":
                myElement = excelDelete;
                break;

            case "closeDialog":
                myElement = closeDialog;
                break;

            case "excelEdit":
                myElement = excelEdit;
                break;

            case "clickCalender":
                myElement = clickCalender;
                break;


            case "validSalaryCons":
                myElement = validSalaryCons;
                break;

            case "addVersion":
                myElement = addVersion;
                break;

            case "constantCostC":
                myElement = constantCostC;
                break;




        }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "inputUserName":
                myElement = inputUserName;
                break;

            case "inputPassword":
                myElement = inputPassword;
                break;

            case "inputName":
                myElement = inputName;
                break;

            case "inputCode":
                myElement = inputCode;
                break;

            case "inputSalaryName":
                myElement = inputSalaryName;
                break;

            case "newSubCatName":
                myElement = newSubCatName;
                break;

            case "newSubCatCode":
                myElement = newSubCatCode;
                break;

            case "excelPeriodCount":
                myElement=excelPeriodCount;
             //   myElement.sendKeys(Keys.TAB);
                break;

            case "excelRow":
                myElement=excelRow;
                myElement.sendKeys(Keys.TAB);
                break;

            case "excelCol":
                myElement=excelCol;
                break;

            case "nameSalaryCons":
                myElement=nameSalaryCons;
                break;

            case "inputKey":
                myElement=inputKey;
                break;

            case "inputValue":
                myElement=inputValue;
                break;

            case "nameCostCentr":
                myElement = nameCostCentr;
                break;

            case "codeCostCentr":
                myElement = codeCostCentr;
                break;

            case "orderNO":
                myElement = orderNO;
                break;

            case "keyCostCent":
                myElement = keyCostCent;
                break;

            case "valueCostCent":
                myElement = valueCostCent;
                break;

            case "ibanBankAccount":
                myElement = ibanBankAccount;
                break;

            case "integrationCodeBank":
                myElement = integrationCodeBank;
                break;


        }
        sendKeysFunction(myElement, value);
    }


    public void  selectOptions(String value,String elementName,String  listName){

        switch (elementName){
            case "userTypSalary":
                myElement= userTypSalary;
                break;

            case "typeCostCenter":
                myElement= typeCostCenter;
                break;

            case "expensAccout":

                myElement= expensAccout;
                break;

            case "currencyBanAcc":
                myElement= currencyBanAcc;
                break;



        }
        clickFunction(myElement);
       // myElement.clear();




        switch (listName){
            case "userTypList":
                myListName=userTypList ;
                break;

            case "typeCostCentOptions":
              //  waitUntilNeed("typeCostCentOptions");
                waiting(2000);
                myListName=typeCostCentOptions ;
                break;

            case "expensAccOptions":
                myListName=expensAccOptions ;
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

        for (WebElement option : optionCountries) {

            if (option.getText().contains(value)) {
                clickFunction(option);
                break;
            }
        }
    }

    public void selectStyle(String value) { // bunu getcssValue den yap

        for (WebElement option : newSubStyleOptions) {

            if (option.getText().contains(value)) {
                clickFunction(option);
                break;
            }
        }
    }



}








/*
    public void delete(String value){
        if(btndeletes.get(btndeletes.size()-1).getText().contains(value)){
            clickFunction(btndeletes.get(btndeletes.size()-1));

            for(WebElement option: optionCountries) {

                if (option.getText().contains(value)){
                    clickFunction(option);
                    break;
        }
    }

*/