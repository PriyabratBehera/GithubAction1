package com.qa.pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class config {
    public void Listner1() {
        String path = System.getProperty("user.dir") + File.separator + "\\listener\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Mobile Automation");

        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);
    }

}
