package StepDefination;

import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.List;

public class _11_Create_Edit_DeleteBankAccount {
    dialogContentPOM dialogContent = new dialogContentPOM();
    fromContentPOM fromContent = new fromContentPOM();
    leftNavPOM leftNav = new leftNavPOM();

    @Given("^Go to Bank Account Page$")
    public void goToBankAccountPage(DataTable elements) {
        List<String> clickelements=elements.asList(String.class);
        for (int i = 0; i <clickelements.size() ; i++) {
        leftNav.findElementAndClickFunction(clickelements.get(i));
        }

    }

    @When("^Create a Bank Account$")
    public void createABankAccount(DataTable elements) {
       // fromContent.waitUntilNeed("btnAdd");
        fromContent.findElementAndClickFunction("btnAdd");

        List<List<String>> sendKeysElements=elements.asLists(String.class);
        int count=0;
        for (int i = 0; i <sendKeysElements.size() ; i++) {
            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

            if(count==1){
               dialogContent.selectOptions("USD","currencyBanAcc","listCurrencyBankAcc");
            }
            count++;

        }
        dialogContent.findElementAndClickFunction("btnSave");


    }
    @And("^Search  new Bank Account$")
    public void searchNewBankAccount(DataTable elements) {

        List<List<String>> sendKeysElements=elements.asLists(String.class);
        for (int i = 0; i <sendKeysElements.size() ; i++) {
            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));
        }

        fromContent.selectOptions("USD","searchCurrency","listCurrencyBankAcc");
        fromContent.findElementAndClickFunction("btnSearch");


    }


    @And("^Edit Bank Account and Delete$")
    public void editBankAccountAndDelete(DataTable elements) {
       // fromContent.waitUntilNeed("editAfterSearch");
        boolean staleElement = true;
        try{
        while (staleElement) {

                fromContent.findElementAndClickFunction("editAfterSearch");
                staleElement = false;

            }
            }
            catch (StaleElementReferenceException e) {

                 staleElement = true;

            }






        fromContent.findElementAndClickFunction("editAfterSearch");

        List<List<String>> sendKeysElements=elements.asLists(String.class);

        int count=0;
        for (int i = 0; i <sendKeysElements.size() ; i++) {
            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

            if(count==1){
                dialogContent.selectOptions("USD","currencyBanAcc","listCurrencyBankAcc");
            }
            count++;

        }
        dialogContent.findElementAndClickFunction("btnSave");

        fromContent.findElementAndClickFunction("afterSearchDelete");
        dialogContent.findElementAndClickFunction("btnYes");




    }


}
