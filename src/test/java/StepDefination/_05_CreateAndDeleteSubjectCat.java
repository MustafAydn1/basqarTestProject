package StepDefination;

import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class _05_CreateAndDeleteSubjectCat {

    dialogContentPOM dialogContent=new dialogContentPOM();
    fromContentPOM fromContent=new fromContentPOM();
    leftNavPOM leftNav=new leftNavPOM();

    @And("^Go to Subject Categories$")
    public void goToSubjectCategories(DataTable elements) {

        List<String > clickelements=elements.asList(String.class);
        for (int i = 0; i <clickelements.size() ; i++) {
        leftNav.findElementAndClickFunction(clickelements.get(i));
        }
    }

    @And("^Create a Subject Category$")
    public void createASubjectCategory(DataTable elements) {
       // fromContent.waitUntilNeed("btnAdd");
        fromContent.findElementAndClickFunction("btnAdd");

        List<List<String>> sendKeysElements=elements.asLists(String.class);
        for (int i = 0; i <sendKeysElements.size() ; i++) {
         dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));
        }

        dialogContent.findElementAndClickFunction("btnSave");

    }

    @And("^Delete Subject Category$")
    public void deleteSubjectCategory(DataTable elements) {

        List<List<String>> sendKeysElements = elements.asLists(String.class);
        for (int i = 0; i < sendKeysElements.size(); i++) {
            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }

        fromContent.findElementAndClickFunction("btnSearch");
        fromContent.waitUntilNeed("afterSearchDelete");
        fromContent.findElementAndClickFunction("afterSearchDelete");

        dialogContent.findElementAndClickFunction("btnYes");

    }
}
