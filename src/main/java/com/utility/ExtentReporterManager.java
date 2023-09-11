package com.utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterManager {
	public static ExtentHtmlReporter htmlReporter;

    public static ExtentReports report;

    //getDate() method

    static String reportName = Utility.getDate() + ".html";

    static String projectPath = System.getProperty("user.dir");

    static String extentReportFilePath = projectPath + "\\extent_reports\\" + reportName;

    public static ExtentReports getReportInstance() {

    	htmlReporter = new ExtentHtmlReporter(extentReportFilePath);

        report = new ExtentReports();

        report.attachReporter(htmlReporter);

        report.setSystemInfo("OS", "Windows 11");

        report.setSystemInfo("Environment", "Test");

        report.setSystemInfo("Build Number", "22000.1936");

        report.setSystemInfo("Browser", "Chrome");

 

        htmlReporter.config().setDocumentTitle("Selenium Results");        //Page Title

        htmlReporter.config().setReportName("Selenium Report");            //Page Header

        htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");

 

        return report;

 

    }

}
