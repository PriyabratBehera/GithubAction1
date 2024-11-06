package com.qa.pages;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Starts Test execution........ "+result.getName());
    }
    public void onTestSuccess(ITestResult result){

    }
    public void onTestSkipped(ITestResult result){

    }
    public void onTestFailure(ITestResult result){

    }

}
