package StepDefination;

import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class _07_SubCatDirectDelete {

    dialogContentPOM dialogContent=new dialogContentPOM();
    fromContentPOM fromContent=new fromContentPOM();
    leftNavPOM leftNav=new leftNavPOM();

    @And("^Go to Subjetc page Create new Subject$")
    public void goToSubjetcPageCreateNewSubject(DataTable elements) {
        leftNav.findElementAndClickFunction("subjects");
        fromContent.findElementAndClickFunction("btnAdd");

        List<List<String >> sendKeysElements=elements.asLists(String.class);

        for (int i = 0; i <sendKeysElements.size(); i++) {
            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }
        dialogContent.findElementAndClickFunction("slcSubCat");
        dialogContent.findElementAndClickFunction("newSubCatOption");

        dialogContent.findElementAndClickFunction("newSubStyle");
        dialogContent.findElementAndClickFunction("styleOption2");
        dialogContent.findElementAndClickFunction("btnSave");


    }


    @And("^Navigate to Subject Categories and Delete$")
    public void navigateToSubjectCategoriesAndDelete(DataTable elements) {
        leftNav.findElementAndClickFunction("subjectCategories");
        List<List<String >> sendKeysElements=elements.asLists(String.class);
        for (int i = 0; i <sendKeysElements.size() ; i++) {

         fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }

        fromContent.findElementAndClickFunction("btnSearch");
        fromContent.findElementAndClickFunction("afterSearchDelete");
        dialogContent.findElementAndClickFunction("btnYes");

    }


}
