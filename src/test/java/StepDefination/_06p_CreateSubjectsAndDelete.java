package StepDefination;

import Pages.Parent;
import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class _06p_CreateSubjectsAndDelete extends Parent {

    dialogContentPOM dialogContent=new dialogContentPOM();
    fromContentPOM fromContent=new fromContentPOM();
    leftNavPOM leftNav=new leftNavPOM();

    @And("^Go to Subjects$")
    public void goToSubjects(DataTable elements) {
        List<String> clickElements=elements.asList(String.class);
        int count=0;
        for (int i = 0; i <clickElements.size() ; i++) {
           leftNav.findElementAndClickFunction(clickElements.get(i));

            if(count==2) {
                fromContent.findElementAndClickFunction("btnAdd");
            }
            count++;
        }
      //  fromContent.findElementAndClickFunction("btnAdd");

    }


    @And("^Create a Subject$")
    public void createASubject(DataTable elements) {
        List<List<String >> sendKeysElements=elements.asLists(String.class);

     int count=0;

        for (int i = 0; i <sendKeysElements.size() ; i++) {

            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

         if(count==1) {dialogContent.findElementAndClickFunction("btnsubCatAdd");}
           
            count++;
         
         }
        

           
        }


    

    @And("^Delete this subject$")
    public void deleteThisSubject(DataTable elements) {

   
            dialogContent.findElementAndClickFunction("newSubCatSave");

            dialogContent.findElementAndClickFunction("slcSubCat");
            dialogContent.findElementAndClickFunction("newSubCatOption");

            dialogContent.findElementAndClickFunction("newSubStyle");
            dialogContent.findElementAndClickFunction("styleOption2");
            dialogContent.findElementAndClickFunction("btnSave");
            fromContent.needToScroll("inputSearchName");

            List<List<String >> sendKeysElements1=elements.asLists(String.class);
            for (int j = 0; j <sendKeysElements1.size() ; j++) {
                waiting(1000);
                fromContent.findElementAndSendKeysFunction(sendKeysElements1.get(j).get(0),sendKeysElements1.get(j).get(1));

            }
            // fromContent.findElementAndClickFunction("searchSubCat");
            // waiting(1000);
            //  fromContent.select("Mustaf9");

            fromContent.findElementAndClickFunction("btnSearch");
            fromContent.findElementAndClickFunction("afterSearchDelete");
            dialogContent.findElementAndClickFunction("btnYes");


        }
        
        
        
        
        
    }


/*

    @And("^Create a Subject$")
    public void createASubject(DataTable elements) {
        List<List<String >> sendKeysElements=elements.asLists(String.class);

        int count=0;

        for (int i = 0; i <sendKeysElements.size() ; i++) {

            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

            if(count==1) {dialogContent.findElementAndClickFunction("btnsubCatAdd");}

            if(count==3) {
                dialogContent.findElementAndClickFunction("newSubCatSave");

                dialogContent.findElementAndClickFunction("slcSubCat");
                dialogContent.findElementAndClickFunction("newSubCatOption");

                dialogContent.findElementAndClickFunction("newSubStyle");
                dialogContent.findElementAndClickFunction("styleOption2");
                dialogContent.findElementAndClickFunction("btnSave");
                fromContent.needToScroll("inputSearchName");

                List<List<String >> sendKeysElements1=elements.asLists(String.class);
                for (int j = 0; j <sendKeysElements1.size() ; j++) {
                    waiting(1000);
                    fromContent.findElementAndSendKeysFunction(sendKeysElements1.get(j).get(0),sendKeysElements1.get(j).get(1));

                }
                // fromContent.findElementAndClickFunction("searchSubCat");
                // waiting(1000);
                //  fromContent.select("Mustaf9");

                fromContent.findElementAndClickFunction("btnSearch");
                fromContent.findElementAndClickFunction("afterSearchDelete");
                dialogContent.findElementAndClickFunction("btnYes");


            }




            count++;
        }



    
   
   
   
 */