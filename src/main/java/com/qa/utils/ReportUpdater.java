package com.qa.utils;


public class ReportUpdater {

    public String[] moduleNameUpdater(String tags) {
        String[] arr = new String[2];
        String moduleName;
        String testType;

        switch (tags) {
            case "@CreateBudgetRegression": {
                 moduleName = "Create Budget";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@CreateBudgetSmoke": {
                 moduleName = "Create Budget";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@CreateBudgetValidation": {
                 moduleName = "Create Budget";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@Mission1CrRegression": {
                 moduleName = "Mission 1Cr";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@Mission1CrSmoke": {
                 moduleName = "Mission 1Cr";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@Mission1CrValidation": {
                 moduleName = "Mission 1Cr";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@RainyDaysRegression": {
                 moduleName = "Rainy Days";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@RainyDaysSmoke": {
                 moduleName = "Rainy Days";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@RainyDaysValidation": {
                 moduleName = "Rainy Days";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@DigitalGoldRegression": {
                 moduleName = "Digital Gold";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@DigitalGoldSmoke": {
                 moduleName = "Digital Gold";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@DigitalGoldValidation": {
                 moduleName = "Digital Gold";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@MutualFundRegression": {
                 moduleName = "Mutual Fund";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@MutualFundSmoke": {
                 moduleName = "Mutual Fund";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@MutualFundValidation": {
                 moduleName = "Mutual Fund";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@SetGoalRegression": {
                 moduleName = "Set Goals";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@SetGoalSmoke": {
                 moduleName = "Set Goals";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@SetGoalValidation": {
                 moduleName = "Set Goals";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@KYCRegression": {
                 moduleName = "KYC";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@KYCSmoke": {
                 moduleName = "KYC";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@KYCValidation": {
                 moduleName = "KYC";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@NPSRegression": {
                moduleName = "NPSInvestment";
                testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@NPSSmoke": {
                moduleName = "NPSInvestment";
                testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@NPSValidation": {
                moduleName = "NPSInvestment";
                testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@HamburgerMenuRegression": {
                moduleName = "HamburgerMenu";
                testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@HamburgerMenuSmoke": {
                moduleName = "HamburgerMenu";
                testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@@HamburgerMenuValidation": {
                moduleName = "HamburgerMenu";
                testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }

            case "@Regression": {
                 moduleName = "All Module";
                 testType = "Regression Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@Smoke": {
                 moduleName = "All Module";
                 testType = "Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            case "@Validation": {
                 moduleName = "All Module";
                 testType = "Validation Test";
                arr[0] = moduleName;
                arr[1] = testType;
                break;
            }
            default: {
                moduleName=tags.replace("@","");
                testType="Smoke Test";
                arr[0] = moduleName;
                arr[1] = testType;
            }

        }
        return arr;
    }

}
