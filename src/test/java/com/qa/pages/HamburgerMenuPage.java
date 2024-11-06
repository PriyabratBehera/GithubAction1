package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.util.Objects;

public class HamburgerMenuPage extends BasePage {
    TestUtils utils = new TestUtils();
    GlobalParams params = new GlobalParams();
    @AndroidFindBy(accessibility = "HAMBURGER")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='HAMBURGER']")
    private MobileElement hamburger;
    @AndroidFindBy(xpath = "//*[@text='KYC']/ancestor::android.view.ViewGroup[5]/descendant::android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='KYC']/ancestor::XCUIElementTypeOther[3])[2]/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement myAvatarIcon;
    @AndroidFindBy(xpath = "//*[@text='KYC']/ancestor::android.view.ViewGroup[5]/descendant::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='KYC']/ancestor::XCUIElementTypeOther[3])[2]/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement closeIconSideMenu;
    @AndroidFindBy(xpath = "//*[@text='My Profile']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My Profile']/ancestor::XCUIElementTypeOther[2]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    private MobileElement backIconMyProfileScreen;
    @AndroidFindBy(xpath = "//*[@text='Mobile Number ']/parent::android.view.ViewGroup/child::android.view.ViewGroup[2]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Joined')]/preceding-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[2]")
    private MobileElement profileEditIcon;
    @AndroidFindBy(xpath = "//*[@text='Update Display Name']/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Update Display Name']/parent::XCUIElementTypeOther/descendant::XCUIElementTypeOther")
    private MobileElement closeIconUpdateDisplayName;
    @AndroidFindBy(xpath = "//*[@text='Name']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Name']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement editProfileNameBox;
    @AndroidFindBy(xpath = "//*[@text='SAVE']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Name']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[3]")
    private MobileElement save;
    @AndroidFindBy(xpath = "//*[@text='Mobile Number ']/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,\"Joined on\")]/preceding-sibling::XCUIElementTypeOther[2]")
    private MobileElement addPhoto;
    @AndroidFindBy(xpath = "//*[@text='Personalize Your App']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Personalize Your App']")
    private MobileElement personalizeYourApp;
    @AndroidFindBy(xpath = "//*[@text='Enter your name']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Enter your name']")
    private MobileElement enterYourName;
    @AndroidFindBy(xpath = "//*[@text='Select State']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Select State']/XCUIElementTypeOther")
    private MobileElement selectState;
    @AndroidFindBy(xpath = "//*[@text='3 steps to go...']/ancestor::android.view.ViewGroup[5]/descendant::android.view.ViewGroup[7]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='3 steps to go...']/ancestor::XCUIElementTypeOther[4]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    private MobileElement backIconBasicKYCScreen;
    @AndroidFindBy(xpath = "//*[@text='Enjoying our services ?']//following-sibling::android.view.ViewGroup[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Enjoying our services ?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[5]")
    private MobileElement fiveStar;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Bank'])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[3]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Enjoying our services ?']//following-sibling::android.view.ViewGroup[2]")
    private MobileElement threeDotIconSipScreen;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uE836 I did not find what I wanted\"])[2]")
    private MobileElement iDidNotFindWhatIWanted;
    @AndroidFindBy(xpath = "//*[@text='Name']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Name']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement profileNameBx;
    @AndroidFindBy(xpath = "//*[@text='Others']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uE836 Others\"])[2]")
    private MobileElement otherRadioBtn;
    @AndroidFindBy(xpath = "//*[@text='Please specify the reason']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Please specify the reason\"]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextView")
    private MobileElement reason;
    @AndroidFindBy(xpath = "//*[@text=' Select Language']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Select Language\"]/XCUIElementTypeOther")
    private MobileElement selectLanguageCloseBtn;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"14. Address for Privacy Related Questions\"]")
    private MobileElement addressForPrivacy;
    @AndroidFindBy(xpath = "//*[contains(@text,'Hello')]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Hello\")]/ancestor::XCUIElementTypeOther[3]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement notifiIcon;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Hello\")]/ancestor::XCUIElementTypeOther[5]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    private MobileElement spendings;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Hello\")]/ancestor::XCUIElementTypeOther[5]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[7]")
    private MobileElement myWealth;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"My Systematic Plan (SIP)\"])[2]/XCUIElementTypeOther")
    private MobileElement mySystematicPlan;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"My Systematic Plan (SIP)\"])[1]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther[1]")
    private MobileElement creatANewSavGoal;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Short Term Deposits at Higher Returns Invest in Money Market Fund & better returns than Bank Deposits\"])[2]")
    private MobileElement shortTermDeposit;
    @AndroidFindBy(xpath = "//*[@text='I did not find what I wanted']/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Better than Savings Account Invest in liquid funds for 50% to 100% higher returns than savings account\"])[2]")
    private MobileElement betterThanSavingAc;
    @AndroidFindBy(xpath = "//*[contains(@text,'Joined on')]/preceding-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Joined on \")]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[1]")
    private MobileElement profileName;
    @AndroidFindBy(xpath = "//*[@text='TabBarItemTitle']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"TabBarItemTitle\"]")
    private MobileElement facebookSc;

    @AndroidFindBy(xpath = "//*[@text='Enter your concern']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"TabBarItemTitle\"]")
    private MobileElement concernBox;
    @AndroidFindBy(xpath = "//*[@text='Complaint Category']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"TabBarItemTitle\"]")
    private MobileElement complaintBx;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Photo taken on Mar 8, 2024, 6:03:21 PM\"]/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"TabBarItemTitle\"]")
    private MobileElement pic;

    @AndroidFindBy(xpath = "//*[@text='Search']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"TabBarItemTitle\"]")
    private MobileElement searchComplaintHis;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Switch\"]/android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"TabBarItemTitle\"]")
    private MobileElement donotHavRef;
    @AndroidFindBy(xpath = "//*[@text='New conversation']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"TabBarItemTitle\"]")
    private MobileElement msgSc;


    public void clickHamburgerIcon() {
        waitForVisibility(hamburger,10);
        click(hamburger);
    }

    public boolean verifyMyAvatarIcon() {
        return isVisible(myAvatarIcon);
    }

    public void clickCloseIconInSideMenu() {
        click(closeIconSideMenu);
    }

    public void clickMyAvatarIcon() {
        click(myAvatarIcon);
    }

    public void clickBackIconMyProfileScreen() {
        click(backIconMyProfileScreen);
    }

    public void clickOnProfileEditIcon() {
        click(profileEditIcon);
    }

    public void clickUpdateDisplayNameCloseIcon() {
        click(closeIconUpdateDisplayName);
    }

    public void editProfileName(String profileName) {
        clear(editProfileNameBox);
        sendKeys(editProfileNameBox, profileName);
    }

    public void clickSaveButton() {
        click(save);
    }

    public void clickAddPhoto() {
        click(addPhoto);
    }

    public void clickIDidNotFindWhatIWanted() {
        click(iDidNotFindWhatIWanted);
    }

    public boolean verifyPersonalizeYourApp() {
        return isVisible(personalizeYourApp);
    }

    public void createProfile(String name) throws Exception {
        sendKeys(enterYourName, name);
        click(selectState);
        clickByText("Andhra Pradesh");
        clickByText("Next");
    }

    public void clickBackButtonInBasicKYCScreen() {
        click(backIconBasicKYCScreen);
    }

    public void clickSecondStarInFeedBackScreen() {
        click(fiveStar);
    }

    public void clickThreeDotIconInSipScreen() {
        click(threeDotIconSipScreen);
    }

    public String editProfileName() throws Exception {
        if (profileNameBx.getText().equals("Ankur")) {
            clear(profileNameBx);
            sendKeys(profileNameBx, "Ramesh");
        } else {
            clear(profileNameBx);
            sendKeys(profileNameBx, "Ankur");
        }
        String profileName = profileNameBx.getText();
        clickStaticText("Name");
        clickByText("Save");
        return profileName;
    }

    public String verifyProfileName() {
        String pName = profileName.getText();
        return pName;
    }

    public void editProfileNameAs() throws Exception {

        clear(profileNameBx);
        sendKeys(profileNameBx, "s");
        clickStaticText("Name");
        clickByText("Save");
    }

    public void clickOtherOptions() {
        click(otherRadioBtn);
    }

    public void writeReason() throws Exception {
        sendKeys(reason, "xyz something");
        clickByText("Please specify the reason");
    }

    public void closeSelectLanSlider() {
        click(selectLanguageCloseBtn);
    }

    public void scrollToAdressOfPrivate() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "14. Address for Privacy Related Questions");
        } else {
            iOSScrollToElementByName(addressForPrivacy, "up", "14. Address for Privacy Related Questions");
        }
    }

    public void clickNotificationIcon() {
        click(notifiIcon);
    }

    public void clickSpendings() {
        click(spendings);
    }

    public void clickMyWealth() {
        click(myWealth);
    }

    public void clickmySystematicPlan() {
        click(mySystematicPlan);
    }

    public void clickCreateANewSavingGoal() {
        click(creatANewSavGoal);
    }

    public void scrollShortTermDepo() throws Exception {
        andIosScroll(shortTermDeposit, "left", betterThanSavingAc);
    }

    public void verifyFacebookSc() {
        Assert.assertTrue(isVisible(facebookSc));
    }
    public void selectComplaintCat(String text) throws Exception {
        click(complaintBx);
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            andScrollToElementUsingUiScrollable("text","Transaction related");
        }
        else{

        }
        clickByText(text);
    }
    public void enterConcern(String text){
        sendKeys(concernBox,text);
    }
    public void uploadScreenshot() throws Exception {
        clickByText("Select image");
        click(pic);
    }
    public void searchComplaintHis(String text) {
       sendKeys(searchComplaintHis,text);
    }
    public void scrollToValiditySec() {
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            andScrollToElementUsingUiScrollable("text","XIII. VALIDITY");
        }
    }
    public void clickIDoNotHaveRef(){
        click(donotHavRef);
    }
    public void verifyMsgSc(){
        click(msgSc);
    }
}
